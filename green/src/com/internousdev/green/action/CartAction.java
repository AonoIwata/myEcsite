package com.internousdev.green.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.CartInfoDAO;
import com.internousdev.green.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware {
	private String totalPrice;
	CartInfoDAO dao = new CartInfoDAO();
	CartInfoDTO dto = new CartInfoDTO();
	Map<String,Object> session;
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

		//カートに飛ぶための処理
		cartInfoList = dao.getCartInfoList(userId);
		int intTotalPrice = 0;
		for(int n=0; n<cartInfoList.size(); n++) {
			intTotalPrice += Integer.parseInt(cartInfoList.get(n).getProductPrice());
		}
		totalPrice = String.valueOf(intTotalPrice);

		return SUCCESS;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public ArrayList<CartInfoDTO> getCartInfoList() {
		return cartInfoList;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

}
