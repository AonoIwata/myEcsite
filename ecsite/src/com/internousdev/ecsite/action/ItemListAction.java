package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport{

	public Map<String,Object> session;
	ItemListDAO itemListDAO=new ItemListDAO();
	ArrayList<ItemListDTO> itemList=new ArrayList<ItemListDTO>();

	public String execute()throws SQLException{
	    itemList=itemListDAO.getItemListInfo();

		String result=SUCCESS;
		return result;
	}

	public ArrayList<ItemListDTO> getItemList(){
		return this.itemList;
	}



}
