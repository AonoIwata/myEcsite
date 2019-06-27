package com.internousdev.green.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.green.dto.MCategoryDTO;
import com.internousdev.green.util.DBConnector;

public class MCategoryDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private List<MCategoryDTO> dtoList = new ArrayList<MCategoryDTO>();

	public List<MCategoryDTO> getCategoryInfo(){

		String sql = "SELECT * FROM m_category";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				MCategoryDTO dto = new MCategoryDTO();
				dto.setId(rs.getInt("id"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setCategoryName(rs.getString("category_name"));
				dto.setCategoryDesc(rs.getString("category_description"));
				dtoList.add(dto);
			}
		}catch(SQLException e){
			e.getStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return dtoList;
	}
}
