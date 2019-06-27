package com.internousdev.ecsite.dto;

public class UserListDTO {
	private String loginId;
	private String userName;
	private String loginPassword;
	private String insert_date;

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId=loginId;
	}

	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}

	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}

}
