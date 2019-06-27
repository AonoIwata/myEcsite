package com.internousdev.green.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() {

		if(!session.containsKey("tempUserId") && !session.containsKey("userId")){
			return "sessionTimeout";
		}
		String result = ERROR;
		String sex = null;
		if (String.valueOf(session.get("sex")).equals("女性")) { //sexが女性なら1を選択
			sex = "1";
		} else {
			sex = "0";
		}
		//会員情報を登録
		UserInfoDAO dao = new UserInfoDAO();
		int count = dao.createUser(
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				String.valueOf(session.get("familyKana")),
				String.valueOf(session.get("firstKana")),
				sex,
				String.valueOf(session.get("email")),
				session.get("userIdForCreateUser").toString(),
				session.get("password").toString());

		//会員情報が入っていたらsuccessを返す
		if(count > 0) {
			result = SUCCESS;
		}

		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyKana");
		session.remove("firstKana");
		session.remove("sex");
		session.remove("sexList");
		session.remove("email");

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
