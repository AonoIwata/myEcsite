package com.internousdev.green.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.CartInfoDAO;
import com.internousdev.green.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware {
	private String productId;
	private String productCount;
	private String price;
	private String totalPrice;
	private String errorMessage;
	private Map<String,Object> session;
	CartInfoDAO dao = new CartInfoDAO();
	ArrayList<CartInfoDTO> cartInfoList = new ArrayList<CartInfoDTO>();

	public String execute() {
		//セッションタイムアウトした場合
		if(!session.containsKey("userId") && !session.containsKey("tempUserId")){
			return "sessionTimeout";
		}
		String ret = ERROR;

		int intProductCount = Integer.parseInt(productCount);

		if(intProductCount > 0 && intProductCount <= 5) {
			int i = 0;
			/* ログイン時か未ログイン時かのふりわけ */
			String userId = null;
			if (session.containsKey("loginFlg")) {
				userId = session.get("userId").toString();
			} else {
				userId = session.get("tempUserId").toString();
			}

			//同じ商品がすでにカート情報テーブルに存在していた場合
			if(dao.isExistsCartInfo(userId, productId)) {
				i = dao.updateProductCount(userId, productId, productCount);

			//存在していなかった場合
			} else {
				i = dao.addCartInfo(userId, productId, productCount, price);
			}

			//処理が成功した場合
			if(i > 0) {
				/* カート画面へ飛ぶための処理 */
				cartInfoList = dao.getCartInfoList(userId);
				int intTotalPrice = 0;
				for(int n=0; n<cartInfoList.size(); n++) {
					intTotalPrice += Integer.parseInt(cartInfoList.get(n).getProductPrice());
				}
				totalPrice = String.valueOf(intTotalPrice);
				ret = SUCCESS;
			//処理が失敗した場合
			} else {
				ret = ERROR;
			}
			return ret;
		}else {
			return ret;
		}
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTotalPrice() {
		return totalPrice;
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
