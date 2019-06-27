package com.internousdev.green.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.green.dto.ProductInfoDTO;
import com.internousdev.green.util.DBConnector;

public class ProductInfoDAO {

	public List<ProductInfoDTO> getProductInfoListAll(){  //* 商品一覧の表示メソッド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		List<ProductInfoDTO>productInfoDTOList=new ArrayList<ProductInfoDTO>();

		String sql="select * from product_info";  //*商品一覧で商品全件を表示するためのSQL

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ProductInfoDTO productInfoDTO=new ProductInfoDTO();
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDesc(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);
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
		return productInfoDTOList;
	}

	public ProductInfoDTO getProductInfoByProductId(int productId){  //* 商品詳細の表示メソッド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		ProductInfoDTO productInfoDTO=new ProductInfoDTO();

		String sql="select * from product_info where product_id=?";  //* 商品詳細から、product_idを使い選択された商品詳細を呼び出すためのSQL
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, productId);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDesc(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
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
		return productInfoDTO;
	}

	/**
	 * 関連商品を取得する。
	 * @param categoryId カテゴリーID
	 * @param productId 商品ID
	 * @param limitOffset データを取得する開始位置
	 * @param limitRowCount データ取得件数
	 * @return 関連商品情報
	 */
	public List<ProductInfoDTO> getRelatedProductList(int categoryId,int productId,int limitOffset,int limitRowCount){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		List<ProductInfoDTO> productInfoDTOList=new ArrayList<ProductInfoDTO>();

		String sql="select * from product_info where category_id=? and product_id not in(?) order by rand() limit ?,?";
		/** 関連商品を表示させるSQL。選択された商品のcategory_idから、同カテゴリーの商品を検出。
		 *  商品詳細で出ている商品以外をカテゴリー表示したいので、product_id not in(?)を使う。
		 *  order by rand()か、round():表示順をランダムにする。
		 *  limit 0,3で、0番目から3件データを取得する。→ActionのgetRelatedProductList()から入力。
		 */

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			ps.setInt(2, productId);
			ps.setInt(3, limitOffset);
			ps.setInt(4, limitRowCount);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ProductInfoDTO productInfoDTO=new ProductInfoDTO();
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDesc(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);
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
		return productInfoDTOList;

	}

	public List<ProductInfoDTO> getProductInfoListByKeyword(String[] keywordsList){  //*検索keywordから商品一覧を出すメソッド。多数のワードで検索する事を踏まえ、String[] keywordsListの配列を配置。
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

		String sql="select * from product_info where";             //* 商品一覧の検索方法によって、SQL文が下記に分岐するように書く。
		boolean initializeFlag=true;                               //* SQL文内で条件分岐をつけるために、initializeFlagにtrueを代入し、下記のif文で分岐できるようにする。
		for(String keyword : keywordsList){                        //* 拡張for文で下記の条件分岐を検索方法によってループできるようにする。配列にある要素の数だけループし、そのつどkeywordに要素を格納している。
			if(!(keyword.equals("")) || keywordsList.length==1){   //* if 検索ワードが空でなく、配列に要素が存在するとき、下記の処理が実行される。
				if(initializeFlag){
					sql +="(product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";  //* 1つの検索ワード（ひら・カナ）の検索。商品名の一部に検索ワードが含まれていればヒットする条件のSQL文。
					initializeFlag=false;
				}else{
					sql +="or (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";  //* 2つの検索ワードの場合。結果的に2ワードの場合3つのSQL文が連結して1文になる。
				}
			}
		}

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ProductInfoDTO productInfoDTO=new ProductInfoDTO();
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDesc(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);
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
		return productInfoDTOList;
	}

	public List<ProductInfoDTO> getProductInfoListByCategoryIdAndKeyword(String[] keywordsList,String categoryId){  //* 検索ワードとカテゴリーで商品一覧を表示するメソッド。
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
		String sql="select * from product_info where";
		boolean initializeFlag=true;
		for(String keyword : keywordsList){
			if(!(keyword.equals("")) || keywordsList.length==1){
				if(initializeFlag){
					sql +=" category_id=" + categoryId +" and ((product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
					initializeFlag=false;
				}else{
					sql +="or (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				}
			}
		}
		sql +=")";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO productInfoDTO = new ProductInfoDTO();
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDesc(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTOList;
	}
}
