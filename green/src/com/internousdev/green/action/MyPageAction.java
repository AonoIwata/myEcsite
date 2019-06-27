package com.internousdev.green.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.UserInfoDAO;
import com.internousdev.green.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	UserInfoDTO dto;
	private Map<String, Object> session;
	public String execute(){
		//sessionがタイムアウトのチェック
		if(!session.containsKey("userId") && !session.containsKey("tempUserId")) {
			return "sessionTimeout";
		}

		UserInfoDAO dao = new UserInfoDAO();

		//dtoにuserIdを格納
		dto = dao.getUserInfo(String.valueOf(session.get("userId")));

		if(dto.getUserId()==null){
			dto = null;
		}

		return SUCCESS;
	}

	public UserInfoDTO getDto() {
		return dto;
	}

	public void setDto(UserInfoDTO dto) {
		this.dto = dto;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
