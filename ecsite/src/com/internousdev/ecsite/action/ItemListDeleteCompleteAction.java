package com.internousdev.ecsite.action;

import java.sql.SQLException;

//import java.util.ArrayList;
import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListDeleteCompleteAction extends ActionSupport{

	ItemListDeleteCompleteDAO ildcdao=new ItemListDeleteCompleteDAO();
//	ArrayList<ItemListDTO> itemList=new ArrayList<ItemListDTO>();
//	private String deleteFlg;
	private String message;

	public String execute()throws SQLException{
		  delete();
		return SUCCESS;
	}

	public void delete()throws SQLException{
		int res=ildcdao.itemListDelete();

		if(res>0){
			setMessage("商品情報を正しく削除しました。");
		}else if(res==0){
			setMessage("商品情報の削除に失敗しました。");
		}
	}

//	public String getDeleteFlg(){
//		return deleteFlg;
//	}
//	public void setDeleteFlg(String deleteFlg){
//		this.deleteFlg=deleteFlg;
//	}

	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}

}
