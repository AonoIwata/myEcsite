package com.internousdev.green.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.green.dto.DestinationInfoDTO;
import com.internousdev.green.util.DBConnector;

public class DestinationInfoDAO {

	private ArrayList<DestinationInfoDTO> dtoList = new ArrayList<DestinationInfoDTO>();
	//宛先情報テーブルに宛先情報を追加するメソッド
	private String sql = "INSERT INTO destination_info"
			+ "(user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address,regist_date,update_date)"
			+ "VALUES(?,?,?,?,?,?,?,?,now(),now())";

	public int createDestination(String userId,String familyName,String firstName,String familyKana,String firstKana,String email,String telNumber,String address){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		int createDis = 0;

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, familyName);
			ps.setString(3, firstName);
			ps.setString(4, familyKana);
			ps.setString(5, firstKana);
			ps.setString(6, email);
			ps.setString(7, telNumber);
			ps.setString(8, address);
			createDis = ps.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return createDis;
	}

	//宛先情報テーブルから宛先情報を抽出するメソッド
	public ArrayList<DestinationInfoDTO> getDestinationInfo(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT id,user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address,regist_date,update_date FROM destination_info WHERE user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
			    DestinationInfoDTO dto = new DestinationInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserId(rs.getString("user_id"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
			    dto.setFamilyKana(rs.getString("family_name_kana"));
				dto.setFirstKana(rs.getString("first_name_kana"));
				dto.setEmail(rs.getString("email"));
				dto.setTelNumber(rs.getString("tel_number"));
				dto.setAddress(rs.getString("user_address"));
				dtoList.add(dto);
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return dtoList;
	}

    //宛先情報テーブルから宛先情報を1項目から削除可能にするためのメソッド
	public int deleteDestinationInfo (int[] array_id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "DELETE FROM destination_info WHERE id=?";

		int count = 0;

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			for(int id : array_id){
				ps.setInt(1, id);
				count += ps.executeUpdate();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}
}
