package com.internousdev.green.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private boolean backFlg;

	public String execute() {

		//sessionがタイムアウトのチェック
		if(!session.containsKey("userId") && !session.containsKey("tempUserId")) {
			return "sessionTimeout";
		}

        //宛先情報入力確認画面以外のページから戻った場合、入力内容を削除
		if(!backFlg){
			session.remove("familyName");
			session.remove("firstName");
			session.remove("familyKana");
			session.remove("firstKana");
			session.remove("email");
			session.remove("telNumber");
			session.remove("address");
		}
		return SUCCESS;
	}

	public boolean getBackFlg(){
		return backFlg;
	}

	public void setBackFlg(boolean backFlg){
		this.backFlg = backFlg;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

}
