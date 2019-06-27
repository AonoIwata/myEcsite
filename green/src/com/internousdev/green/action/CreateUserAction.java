package com.internousdev.green.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateUserAction extends ActionSupport implements SessionAware{
	private int backFlag;
	private Map<String, Object> session;

	public String execute() {

		if(!session.containsKey("tempUserId") && !session.containsKey("userId")){
			return "sessionTimeout";
		}

		if (backFlag != 1) {
			//sessionに格納されている情報をすべて初期化する。
			session.remove("familyName");
			session.remove("firstName");
			session.remove("familyKana");
			session.remove("firstKana");
			session.remove("sex");
			session.remove("sexList");
			session.remove("email");
			session.remove("userIdForCreateUser");
			session.remove("password");
		}
		List<String> sexList = new ArrayList<String>();
		// 画面表示時に選択されている性別を男性にする
		if(!session.containsKey("sex")) {
			session.put("sex", "男性");
		}else {
			session.put("sex", String.valueOf(session.get("sex")));
		}
		sexList.add("男性");
		sexList.add("女性");
		session.put("sexList", sexList);

		return SUCCESS;
	}

	public int getBackFlag() {
		return backFlag;
	}

	public void setBackFlag(int backFlag) {
		this.backFlag = backFlag;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
