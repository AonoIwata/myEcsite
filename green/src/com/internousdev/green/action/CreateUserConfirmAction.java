package com.internousdev.green.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.UserInfoDAO;
import com.internousdev.green.util.CommonUtility;
import com.internousdev.green.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserConfirmAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyKana;
	private String firstKana;
	private String sex;
	private String email;
	private String userId;
	private String password;
	private List<String> familyNameErrorMessageList;
	private List<String> firstNameErrorMessageList;
	private List<String> familyKanaErrorMessageList;
	private List<String> firstKanaErrorMessageList;
	private List<String> emailErrorMessageList;
	private List<String> userIdErrorMessageList;
	private List<String> passwordErrorMessageList;
	private String isExistsUserErrorMessage;
	private Map<String, Object> session;

	public String execute() {

		if(!session.containsKey("tempUserId") && !session.containsKey("userId")){
			return "sessionTimeout";
		}

		String result = ERROR;

		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyKana", familyKana);
		session.put("firstKana",firstKana);
		session.put("sex",sex);
		session.put("email",email);
		session.put("userIdForCreateUser",userId);
		session.put("password",password);

		InputChecker ic = new InputChecker();

		//InputCheckerで正しい情報が入力されているか確認
		familyNameErrorMessageList = ic.doCheck("姓", familyName, 1, 16, true, true, true, false, false, false, false);
		firstNameErrorMessageList = ic.doCheck("名", firstName, 1, 16, true, true, true, false, false, false, false);
		familyKanaErrorMessageList = ic.doCheck("姓ふりがな", familyKana, 1, 16, false, false, true, false, false, false, false);
		firstKanaErrorMessageList = ic.doCheck("名ふりがな", firstKana, 1, 16, false, false, true, false, false, false, false);
		emailErrorMessageList = ic.doCheckForEmail("メールアドレス", email, 10, 32);
		userIdErrorMessageList = ic.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false, false, false);
		passwordErrorMessageList = ic.doCheck("パスワード", password, 1, 16, true, false, false, true, false, false, false);

		if(familyNameErrorMessageList.size() > 0
		|| firstNameErrorMessageList.size() > 0
		|| familyKanaErrorMessageList.size() > 0
		|| firstKanaErrorMessageList.size() > 0
		|| emailErrorMessageList.size() > 0
		|| userIdErrorMessageList.size() > 0
		|| passwordErrorMessageList.size() > 0) {
			return result;
		}

		UserInfoDAO dao = new UserInfoDAO();

		if(dao.isExistsUserInfo(userId)){ //既に登録されているIdに対しては"使用できないユーザーIDです。"を表示。
			isExistsUserErrorMessage = "使用できないユーザーIDです。";
		}else{
			CommonUtility cu = new CommonUtility();
			password= cu.concealPassword(password);
			result = SUCCESS;
		}
		return result;
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
		this.firstName=firstName;
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

	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}

	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public List<String> getFamilyNameErrorMessageList(){
		return familyNameErrorMessageList;
	}
	public void setFamilyNameErrorMessageList(List<String> familyNameErrorMessageList){
		this.familyNameErrorMessageList=familyNameErrorMessageList;
	}

	public List<String> getFamilyKanaErrorMessageList(){
		return familyKanaErrorMessageList;
	}
	public void setFamilyKanaErrorMessageList(List<String> familyKanaErrorMessageList){
		this.familyKanaErrorMessageList = familyKanaErrorMessageList;
	}

	public List<String> getFirstNameErrorMessageList(){
		return firstNameErrorMessageList;
	}
	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList){
		this.firstNameErrorMessageList = firstNameErrorMessageList;
	}

	public List<String> getFirstKanaErrorMessageList(){
		return firstKanaErrorMessageList;
	}
	public void setFirstKanaErrorMessageList(List<String> firstKanaErrorMessageList){
		this.firstKanaErrorMessageList = firstKanaErrorMessageList;
	}

	public List<String> getEmailErrorMessageList(){
		return emailErrorMessageList;
	}
	public void setEmailErrorMessageList(List<String> emailErrorMessageList){
		this.emailErrorMessageList = emailErrorMessageList;
	}

	public List<String> getUserIdErrorMessageList() {
		return userIdErrorMessageList;
	}
	public void setUserIdErrorMessageList(List<String> userIdErrorMessageList) {
		this.userIdErrorMessageList = userIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public String getIsExistsUserErrorMessage() {
		return isExistsUserErrorMessage;
	}

	public void setIsExistsUserErrorMessage(String isExistsUserErrorMessage) {
		this.isExistsUserErrorMessage = isExistsUserErrorMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
