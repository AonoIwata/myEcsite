package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport{

	public Map<String,Object> session;
	UserListDAO userListDAO=new UserListDAO();
	ArrayList<UserListDTO> userList=new ArrayList<UserListDTO>();

	public String execute()throws SQLException{
	    userList=userListDAO.getUserListInfo();

		String result=SUCCESS;
		return result;
	}

	public ArrayList<UserListDTO> getUserList(){
		return this.userList;
	}



}
