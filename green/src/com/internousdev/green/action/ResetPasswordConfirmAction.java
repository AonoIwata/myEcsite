package com.internousdev.green.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.UserInfoDAO;
import com.internousdev.green.util.CommonUtility;
import com.internousdev.green.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordConfirmAction extends ActionSupport implements SessionAware{
	private String userId;
	private String password;
	private String newPassword;
	private String reConfirmationPassword;
	private Map<String, Object> session;
	private List<String> userIdErrorMessageList;
	private List<String> passwordErrorMessageList;
	private List<String> newPasswordErrorMessageList;
	private List<String> reConfirmationPasswordErrorMessageList;
	private String passwordIncorrectErrorMessage;
	private String newPasswordIncorrectErrorMessage;
	private String concealedPassword;

	public String execute(){

		String result = ERROR;

		InputChecker ic = new InputChecker();
		session.put("userIdForResetPassword", userId);

		//InputCheckerを使用してエラーがあればListにメッセージが入る
		userIdErrorMessageList = ic.doCheck("ユーザーID", userId, 1, 8,true, false, false, true, false, false, false);
		passwordErrorMessageList = ic.doCheck("現在のパスワード", password, 1, 16, true, false, false, true, false, false, false);
		newPasswordErrorMessageList = ic.doCheck("新しいパスワード", newPassword, 1, 16, true, false, false, true, false, false, false);
		reConfirmationPasswordErrorMessageList = ic.doCheck("新しいパスワード(再確認)", reConfirmationPassword, 1, 16, true, false, false, true, false, false, false);

		//エラーメッセージがある場合
		if(userIdErrorMessageList.size() > 0
			|| passwordErrorMessageList.size() > 0
			|| newPasswordErrorMessageList.size() > 0
			|| reConfirmationPasswordErrorMessageList.size() > 0){
			return result;
		}

		//入力したユーザーIDと現在のパスワードがDB上と異なる場合
		UserInfoDAO dao = new UserInfoDAO();
		if(!dao.isExistsUserInfo(userId,password)){
			passwordIncorrectErrorMessage = "ユーザーIDまたは現在のパスワードが異なります。";
			return result;
		}

		newPasswordIncorrectErrorMessage = ic.doPasswordCheck(newPassword, reConfirmationPassword);

		//エラーなしの場合
		if(newPasswordIncorrectErrorMessage == null){
			CommonUtility cu = new CommonUtility();
			concealedPassword = cu.concealPassword(newPassword);
			session.put("newPassword", newPassword);
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

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getNewPassword(){
		return newPassword;
	}

	public void setNewPassword(String newPassword){
		this.newPassword = newPassword;
	}

	public String getReConfirmationPassword(){
		return reConfirmationPassword;
	}

	public void setReConfirmationPassword(String reConfirmationPassword){
		this.reConfirmationPassword = reConfirmationPassword;
	}

	public Map<String, Object> session(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
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

	public List<String> getNewPasswordErrorMessageList() {
		return newPasswordErrorMessageList;
	}

	public void setNewPasswordErrorMessageList(List<String> newPasswordErrorMessageList) {
		this.newPasswordErrorMessageList = newPasswordErrorMessageList;
	}

	public List<String> getReConfirmationPasswordErrorMessageList() {
		return reConfirmationPasswordErrorMessageList;
	}

	public void setReConfirmationPasswordErrorMessageList(List<String> reConfirmationPasswordErrorMessageList) {
		this.reConfirmationPasswordErrorMessageList = reConfirmationPasswordErrorMessageList;
	}

	public String getPasswordIncorrectErrorMessage() {
		return passwordIncorrectErrorMessage;
	}

	public void setPasswordIncorrectErrorMessage(String passwordIncorrectErrorMessage) {
		this.passwordIncorrectErrorMessage = passwordIncorrectErrorMessage;
	}

	public String getNewPasswordIncorrectErrorMessage() {
		return newPasswordIncorrectErrorMessage;
	}

	public void setNewPasswordIncorrectErrorMessage(String newPasswordIncorrectErrorMessage) {
		this.newPasswordIncorrectErrorMessage = newPasswordIncorrectErrorMessage;
	}

	public String getConcealedPassword() {
		return concealedPassword;
	}

	public void setConcealedPassword(String concealedPassword) {
		this.concealedPassword = concealedPassword;
	}

	public Map<String, Object> getSession() {
		return session;
	}

}