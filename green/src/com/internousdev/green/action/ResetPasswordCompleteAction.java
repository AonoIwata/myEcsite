package com.internousdev.green.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;

	public String execute(){

		String result = ERROR;
		UserInfoDAO dao = new UserInfoDAO();
		int count = dao.resetPassword(session.get("userIdForResetPassword").toString(), session.get("newPassword").toString());

		if(count > 0){
			result = SUCCESS;
		}

		//画面遷移した場合にユーザーIDとパスワードがsessionに入ってるため削除
		session.remove("userIdForResetPassword");
		session.remove("newPassword");
		return result;
	}

	public Map<String, Object> session(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
