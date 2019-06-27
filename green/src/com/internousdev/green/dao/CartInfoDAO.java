package com.internousdev.green.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.internousdev.green.dto.CartInfoDTO;
import com.internousdev.green.util.DBConnector;

public class CartInfoDAO {
	DBConnector db = new DBConnector();
	ArrayList<CartInfoDTO> cartInfoList = new ArrayList<CartInfoDTO>();

	//カート情報テーブルにカート情報を追加するメソッド
	public int addCartInfo(String userId, String productId, String productCount, String price) {
		String sql = "INSERT INTO cart_info(user_id,product_id,product_count,price,regist_date,update_date) VALUES(?,?,?,?,now(),now())";
		Connection con = db.getConnection();
		int ret = 0;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, Integer.parseInt(productId));
			ps.setInt(3, Integer.parseInt(productCount));
			ps.setInt(4, Integer.parseInt(price));
			ret = ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	//カート情報テーブルからカート情報を抽出するメソッド
	public ArrayList<CartInfoDTO> getCartInfoList(String userId) {
		String sql = "SELECT ci.product_id AS id, ci.product_count, pi.price AS price, pi.product_name, pi.product_name_kana, (ci.product_count * pi.price) AS product_price, pi.image_file_path, pi.image_file_name, pi.release_date, pi.release_company FROM cart_info ci LEFT JOIN product_info pi ON ci.product_id = pi.product_id WHERE ci.user_id = ? ORDER BY ci.update_date DESC, ci.regist_date DESC";
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CartInfoDTO dto = new CartInfoDTO();
				dto.setProductId(rs.getString("id"));
				dto.setProductCount(rs.getString("product_count"));
				dto.setPrice(rs.getString("price"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductKana(rs.getString("product_name_kana"));
				dto.setProductPrice(rs.getString("product_price"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setReleaseCompany(rs.getString("release_company"));
				cartInfoList.add(dto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return cartInfoList;
	}

	//カート情報テーブルに同じユーザーIDで同じ商品が存在するかどうか確認するメソッド
	public boolean isExistsCartInfo(String userId, String productId) {
		boolean ret = false;
		String sql = "SELECT COUNT(id) AS COUNT FROM cart_info WHERE user_id = ? AND product_id = ?";
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, Integer.parseInt(productId));
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getInt("COUNT") > 0) {
					ret = true;
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	//同じ商品が存在した場合、カート情報テーブルの商品の購入個数を追加するメソッド
	public int updateProductCount(String userId, String productId, String productCount) {
		int ret = 0;
		String sql = "UPDATE cart_info SET product_count = (product_count + ?), update_date = now() WHERE user_id = ? AND product_id = ?";
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(productCount));
			ps.setString(2, userId);
			ps.setInt(3, Integer.parseInt(productId));
			ret = ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	//同じ商品が存在した場合、カート情報テーブルから仮ユーザーのカート情報を削除するメソッド
	public int deleteTempUserCartInfo(String userId, String productId) {
		String sql = "DELETE FROM cart_info WHERE user_id = ? AND product_id = ?";
		int ret = 0;
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, Integer.parseInt(productId));
			ret = ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	//同じ商品が存在しなかった場合、カート情報テーブルの仮ユーザーIDをユーザーIDに変更するメソッド
	public int updateCartInfoUserId(String userId, String tempUserId, String productId) {
		String sql = "UPDATE cart_info SET user_id = ? WHERE user_id = ? AND product_id = ?";
		int ret = 0;
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, tempUserId);
			ps.setInt(3, Integer.parseInt(productId));
			ret = ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	//カート情報テーブルから選択した商品のカート情報を削除するメソッド
	public int deleteProductCartInfo(String userId, Collection<String> checkList) {
		String sql = "DELETE FROM cart_info WHERE user_id = ? AND product_id = ?";
		int i = 0;
		int count = 0;
		int ret = 0;
		Connection con = db.getConnection();

		try {
			for(String value : checkList) {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, userId);
				ps.setInt(2, Integer.parseInt(value));
				i = ps.executeUpdate();
				count += i;
			}
			ret = count;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	//決済完了時、カート情報テーブルからカート情報を削除するメソッド
	public int deleteCartInfo(String userId) {
		String sql = "DELETE FROM cart_info WHERE user_id = ?";
		int ret = 0;
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ret = ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}
}

