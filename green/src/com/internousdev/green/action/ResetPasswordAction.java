package com.internousdev.green.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private boolean backFlg;

	public String execute(){

		if(!backFlg){
			session.remove("userIdForResetPassword");
		}

		return SUCCESS;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public boolean getBackFlg(){
		return backFlg;
	}

	public void setBackFlg(boolean backFlg){
		this.backFlg = backFlg;
	}

}
