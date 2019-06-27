package com.internousdev.green.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationConfirmAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyKana;
	private String firstKana;
	private String email;
	private String telNumber;
	private String address;

	private List<String> familyNameErrorMessage;
	private List<String> firstNameErrorMessage;
	private List<String> familyKanaErrorMessage;
	private List<String> firstKanaErrorMessage;
	private List<String> emailErrorMessage;
	private List<String> telNumberErrorMessage;
	private List<String> addressErrorMessage;

	private Map<String,Object> session;
	private String errorMessage;

	public String execute() {

		if(!session.containsKey("userId") && !session.containsKey("tempUserId")) {
			return "sessionTimeout";
		}

	    session.put("familyName", familyName);
	    session.put("firstName", firstName);
	    session.put("familyKana", familyKana);
	    session.put("firstKana", firstKana);
	    session.put("email", email);
	    session.put("telNumber", telNumber);
	    session.put("address", address);

		//文字種、文字数、未入力のチェック
		InputChecker ic = new InputChecker();

		familyNameErrorMessage = ic.doCheck("姓", familyName, 1, 16, true, true, true, false, false, false, false);
		firstNameErrorMessage = ic.doCheck("名", firstName, 1, 16, true, true, true, false, false, false, false);
		familyKanaErrorMessage = ic.doCheck("姓ふりがな", familyKana, 1, 16, false, false, true, false, false, false, false);
		firstKanaErrorMessage = ic.doCheck("名ふりがな", firstKana, 1, 16, false, false, true, false, false, false, false);
		addressErrorMessage = ic.doCheck("住所", address, 10, 50, true, true, true, true, false, true, false);
	    telNumberErrorMessage = ic.doCheck("電話番号", telNumber, 10, 13, false, false, false, true, false, false, false);
	    emailErrorMessage = ic.doCheckForEmail("メールアドレス",email,10,32);

	    if(familyNameErrorMessage.size() > 0 || firstNameErrorMessage.size() > 0 || familyKanaErrorMessage.size() > 0 ||
	    	emailErrorMessage.size() > 0 || telNumberErrorMessage.size() > 0 || addressErrorMessage.size() > 0){
	    	return ERROR;
	    }
	    return SUCCESS;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyKana() {
		return familyKana;
	}

	public void setFamilyKana(String familyKana) {
		this.familyKana = familyKana;
	}

	public String getFirstKana() {
		return firstKana;
	}

	public void setFirstKana(String firstKana) {
		this.firstKana = firstKana;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getFamilyNameErrorMessage() {
		return familyNameErrorMessage;
	}

	public void setFamilyNameErrorMessage(List<String> familyNameErrorMessage) {
		this.familyNameErrorMessage = familyNameErrorMessage;
	}

	public List<String> getFirstNameErrorMessage() {
		return firstNameErrorMessage;
	}

	public void setFirstNameErrorMessage(List<String> firstNameErrorMessage) {
		this.firstNameErrorMessage = firstNameErrorMessage;
	}

	public List<String> getFamilyKanaErrorMessage() {
		return familyKanaErrorMessage;
	}

	public void setFamilyKanaErrorMessage(List<String> familyKanaErrorMessage) {
		this.familyKanaErrorMessage = familyKanaErrorMessage;
	}

	public List<String> getFirstKanaErrorMessage() {
		return firstKanaErrorMessage;
	}

	public void setFirstKanaErrorMessage(List<String> firstKanaErrorMessage) {
		this.firstKanaErrorMessage = firstKanaErrorMessage;
	}

	public List<String> getEmailErrorMessage() {
		return emailErrorMessage;
	}

	public void setEmailErrorMessage(List<String> emailErrorMessage) {
		this.emailErrorMessage = emailErrorMessage;
	}

	public List<String> getTelNumberErrorMessage() {
		return telNumberErrorMessage;
	}

	public void setTelNumberErrorMessage(List<String> telNumberErrorMessage) {
		this.telNumberErrorMessage = telNumberErrorMessage;
	}

	public List<String> getAddressErrorMessage() {
		return addressErrorMessage;
	}

	public void setAddressErrorMessage(List<String> addressErrorMessage) {
		this.addressErrorMessage = addressErrorMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

    public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
