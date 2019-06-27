package com.internousdev.green.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;

	public String execute(){
		UserInfoDAO userInfoDAO=new UserInfoDAO();
		String userId=String.valueOf(session.get("userId"));                      //* 下記のlogoutメソッドで、誰がログアウトするのか判定する為に、sessionのuserIdをString型に変えて持ってきている。
		boolean userIdCheck=Boolean.valueOf(String.valueOf(session.get("userIdCheck")));  //* セッションのuserIdCheck（ユーザーID保存の有無）をuserIdCheckにboolean型で代入。
		int count=userInfoDAO.logout(userId);                                     //* UserInfoDAOのlogoutメソッドを呼び出して、その回数をcountに代入。
		if(count>0){                                                              //* logoutメソッドが一回以上実行されたら、下記の処理を実行。
			session.clear();                                                      //* セッションを全て空にする。
			if(userIdCheck){                                                      //* もしuserIdCheckがtrue（あれば）ならばk。
				session.put("userIdCheck", true);                          //* userIdCheckのセッションにtrueを入れる。
				session.put("checkedUserId", userId);                                    //* userIdのセッションにuserIdを入れる。
			}
		}
		return SUCCESS;
	}

	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
