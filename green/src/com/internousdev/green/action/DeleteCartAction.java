package com.internousdev.green.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.CartInfoDAO;
import com.internousdev.green.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCartAction extends ActionSupport implements SessionAware {
	private String totalPrice;
	private Collection<String> checkList;
	private String errorMessage;
	private Map<String,Object> session;
	CartInfoDAO dao = new CartInfoDAO();
	ArrayList<CartInfoDTO> cartInfoList = new ArrayList<CartInfoDTO>();

	public String execute() {
		//セッションタイムアウトした場合
		if(!session.containsKey("userId") && !session.containsKey("tempUserId")){
			return "sessionTimeout";
		}

		/* ログイン時か未ログイン時かのふりわけ */
		String userId = null;
		if (session.containsKey("loginFlg")) {
			userId = session.get("userId").toString();
		} else {
			userId = session.get("tempUserId").toString();
		}

		String ret = ERROR;
		int i;
		i = dao.deleteProductCartInfo(userId, checkList);
		//処理が成功した場合
		if(i > 0) {
			/* カート画面へ飛ぶための処理 */
			cartInfoList = dao.getCartInfoList(userId);
			int intTotalPrice = 0;
			for(int n=0; n<cartInfoList.size(); n++) {
				intTotalPrice += Integer.parseInt(cartInfoList.get(n).getProductPrice());
			}
			totalPrice = String.valueOf(intTotalPrice);
			//カート情報がない場合
			if(cartInfoList.isEmpty()) {
				errorMessage = "カート情報がありません。";
			}
			ret = SUCCESS;
		//処理が失敗した場合
		} else {
			ret = ERROR;
		}
		return ret;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public ArrayList<CartInfoDTO> getCartInfoList() {
		return cartInfoList;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
}
