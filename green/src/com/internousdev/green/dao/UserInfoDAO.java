package com.internousdev.green.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.green.dto.UserInfoDTO;
import com.internousdev.green.util.DBConnector;

public class UserInfoDAO {

	public int createUser(String familyName, String firstName, String familyKana,
			String firstKana, String sex, String email, String userId, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;
		String sql = "insert into user_info(user_id, password, family_name, first_name, family_name_kana,"
				+ " first_name_kana, sex, email, status, logined, regist_date, update_date)"
				+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, now(), now())";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ps.setString(3, familyName);
			ps.setString(4, firstName);
			ps.setString(5, familyKana);
			ps.setString(6, firstKana);
			ps.setString(7, sex);
			ps.setString(8, email);
			ps.setInt(9, 0);
			ps.setInt(10, 1);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

	public boolean isExistsUserInfo(String userId, String password){ //IDとpwの確認
		DBConnector db =new DBConnector();
		Connection con = db.getConnection();
		boolean result = false;
		String sql = "select count(*) as count from user_info where user_id=? and password=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				if (rs.getInt("count") > 0){
					result=true;
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	public boolean isExistsUserInfo(String userId){ //userIdのみでの確認
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean result = false;
		String sql ="select count(*) as count from user_info where user_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				if(rs.getInt("count") > 0){
					result = true;
				}
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	public UserInfoDTO getUserInfo(String userId, String password){ //idとpwを元に会員情報を確認
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		UserInfoDTO dto = new UserInfoDTO();
		String sql ="select * from user_info where user_id = ? and password =?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,userId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setUserId(rs.getString("user_id"));
				dto.setPassword(rs.getString("password"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyKana(rs.getString("family_name_kana"));
				dto.setFirstKana(rs.getString("first_name_kana"));
				dto.setSex(rs.getInt("sex"));
				dto.setEmail(rs.getString("email"));
				dto.setLoginFlg(rs.getInt("status"));
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return dto;
	}

	public UserInfoDTO getUserInfo(String userId){//Idを元に会員情報を確認
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		UserInfoDTO dto = new UserInfoDTO();
		String sql = "select * from user_info where user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setUserId(rs.getString("user_id"));
				dto.setPassword(rs.getString("password"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyKana(rs.getString("family_name_kana"));
				dto.setFirstKana(rs.getString("first_name_kana"));
				dto.setSex(rs.getInt("sex"));
				dto.setEmail(rs.getString("email"));
				dto.setLoginFlg(rs.getInt("logined"));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return dto;
	}

	public int resetPassword(String userId, String password){//idとpwを元にpwをリセットする。
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "update user_info set password=?, update_date=now() where user_id=?";
		int result = 0;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, userId);
			result = ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	public int login(String userId, String password){// logined=1にすることでログイン状態にする。
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		String sql = "update user_info set logined = 1, update_date=now() where user_id = ? and password = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;

	}

	public int logout(String userId){//logined = 0にすることで非ログイン状態にする。
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		String sql = "update user_info set logined = 0, update_date=now() where user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			result = ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}
}
