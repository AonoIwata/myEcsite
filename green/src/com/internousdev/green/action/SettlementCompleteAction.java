package com.internousdev.green.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.CartInfoDAO;
import com.internousdev.green.dao.DestinationInfoDAO;
import com.internousdev.green.dao.PurchaseHistoryInfoDAO;
import com.internousdev.green.dto.CartInfoDTO;
import com.internousdev.green.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private int destinationId;
	private PurchaseHistoryInfoDAO Pdao = new PurchaseHistoryInfoDAO();
	private CartInfoDAO Cdao = new CartInfoDAO();
	DestinationInfoDAO Ddao = new DestinationInfoDAO();

	public String execute(){

		//セッションタイムアウトの確認
		if(!session.containsKey("userId") && !session.containsKey("tempUserId")){
			return "sessionTimeout";
		}

		//受け取った宛先IDが存在しているか確認
		ArrayList<DestinationInfoDTO> DdtoList = Ddao.getDestinationInfo(session.get("userId").toString());
		int Dresult = 0;
		for(DestinationInfoDTO Ddto : DdtoList){
			if(destinationId == Ddto.getId()){
				Dresult += 1;
			}
		}
		if(Dresult == 0){
			return ERROR;
		}

		//購入履歴テーブルの登録とカート情報テーブルの削除の処理を一件ずつ行う。
		ArrayList<CartInfoDTO> cartInfoList = autoCast(session.get("cartInfoList"));
		for(CartInfoDTO dto : cartInfoList){

			//必要な情報が欠けている場合、エラー画面へ遷移
			if(destinationId == 0 || dto.getProductId() == null || dto.getProductCount() == null || dto.getPrice() == null){
				return ERROR;
			}

			int Presult = Pdao.regist(session.get("userId").toString(), Integer.parseInt(dto.getProductId()), Integer.parseInt(dto.getProductCount()), destinationId, Integer.parseInt(dto.getPrice()));
			if(Presult == 0){
				return ERROR;  //登録失敗の場合
			}else{
				//登録成功の場合
				ArrayList<String> productId = new ArrayList<String>();
				productId.add(dto.getProductId());
				int Cresult = Cdao.deleteProductCartInfo(session.get("userId").toString(), productId);
				if(Cresult == 0){
					return ERROR;  //削除失敗の場合
				}
			}
		}
		return SUCCESS;  //登録・削除が全件成功の場合

	}

	public Map<String,Object> getSession(){
		return this.session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public int getDestinationId(){
		return this.destinationId;
	}

	public void setDestinationId(int destinationId){
		this.destinationId = destinationId;
	}

	//Object型から総称型(ListやMap)へのキャストを行うメソッド
	@SuppressWarnings("unchecked")
	public static <T> T autoCast(Object obj){
		T castObj = (T) obj;
		return castObj;
	}
}
