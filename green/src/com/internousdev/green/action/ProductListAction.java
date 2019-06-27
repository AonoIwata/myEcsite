package com.internousdev.green.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.MCategoryDAO;
import com.internousdev.green.dao.ProductInfoDAO;
import com.internousdev.green.dto.MCategoryDTO;
import com.internousdev.green.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductListAction extends ActionSupport implements SessionAware{
	private List<ProductInfoDTO> productInfoDTOList;
	private Map<String,Object> session;

	public String execute(){

		ProductInfoDAO productInfoDAO=new ProductInfoDAO();
		productInfoDTOList=productInfoDAO.getProductInfoListAll();

		//* 商品一覧画面にも、カテゴリーのリストを表示するために作成。
		if(!session.containsKey("mCategory")){
			List<MCategoryDTO> mCategoryDTOList=new ArrayList<MCategoryDTO>();
			MCategoryDAO mCategoryDAO=new MCategoryDAO();
			try{
				mCategoryDTOList=mCategoryDAO.getCategoryInfo();
			}catch(NullPointerException e){
				mCategoryDTOList=null;
			}
			session.put("mCategory",mCategoryDTOList);  //* MCategoryDTOからもってきたカテゴリー一覧をセッションに格納しておく
		}
		return SUCCESS;
	}

	public List<ProductInfoDTO> getProductInfoDTOList(){
		return productInfoDTOList;
	}

	public void setProductInfoDTOList(List<ProductInfoDTO> productInfoDTOList){
		this.productInfoDTOList=productInfoDTOList;
	}

	public Map<String,Object>getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
