package com.internousdev.green.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.DestinationInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationCompleteAction extends ActionSupport implements SessionAware {

    private String userId;
	private String familyName;
	private String firstName;
	private String familyKana;
	private String firstKana;
	private String email;
	private String telNumber;
	private String address;
	private Map<String,Object> session;
	private DestinationInfoDAO dao = new DestinationInfoDAO();

	public String execute() {
		//セッションタイムアウトの確認
		if(!session.containsKey("userId") && !session.containsKey("tempUserId")) {
			return "sessionTimeout";
		}
		String result = ERROR;

		//宛先情報を登録
		int createDis = dao.createDestination(session.get("userId").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("familyKana").toString(),
				session.get("firstKana").toString(),
				session.get("email").toString(),
				session.get("telNumber").toString(),
				session.get("address").toString());

		//遷移先で不要な情報な為削除
				session.remove("familyName");
				session.remove("firstName");
				session.remove("familyKana");
				session.remove("firstKana");
				session.remove("email");
				session.remove("telNumber");
				session.remove("address");

		if(createDis > 0){
			result = SUCCESS;
		}
		return result;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFamilyKana(){
		return familyKana;
	}

	public void setFamilyKana(String familyKana){
		this.familyKana = familyKana;
	}

	public String getFirstKana(){
		return firstKana;
	}

	public void setFirstKana(String firstKana){
		this.firstKana = firstKana;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getTelNumber(){
		return telNumber;
	}

	public void setTelNumber(String telNumber){
		this.telNumber = telNumber;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}
