package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {

	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

    public ArrayList<UserListDTO> getUserListInfo()throws SQLException{
    	ArrayList<UserListDTO>userListDTO=new ArrayList<UserListDTO>();

    	String sql="select login_id,user_name,login_pass,insert_date from login_user_transaction";

    	try{
    		PreparedStatement ps=con.prepareStatement(sql);
    		ResultSet rs=ps.executeQuery();
    		while(rs.next()){
    			UserListDTO dto=new UserListDTO();
    			dto.setUserName(rs.getString("user_name"));
    			dto.setLoginId(rs.getString("login_id"));
    			dto.setLoginPassword(rs.getString("login_pass"));
    			dto.setInsert_date(rs.getString("insert_date"));
    			userListDTO.add(dto);
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		con.close();
    	}
    	return userListDTO;
    }


}
