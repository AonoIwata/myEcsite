package com.internousdev.green.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.MCategoryDAO;
import com.internousdev.green.dao.ProductInfoDAO;
import com.internousdev.green.dto.MCategoryDTO;
import com.internousdev.green.dto.ProductInfoDTO;
import com.internousdev.green.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
	private List<String> keywordsErrorMessageList;
	private String keywords;
	private String categoryId;

	public String execute(){

		ProductInfoDAO dao = new ProductInfoDAO();
		InputChecker ic = new InputChecker();

		//カテゴリー情報が受け取れなかった場合、「すべてのカテゴリー」と解釈する。
		if (categoryId == null) {
			categoryId = "1";
		}

		//検索ワードが受け取れなかった場合、空文字と解釈する。
		if(keywords == null){
			keywords = "";
		}

		//カテゴリーのセッションが切れている場合、カテゴリー情報を再取得する。
		if(!session.containsKey("mCategory")){
			MCategoryDAO Mdao = new MCategoryDAO();
			List<MCategoryDTO> mCategory =  Mdao.getCategoryInfo();
			session.put("mCategory", mCategory);
		}

		//入力チェックを行う。
		if (!keywords.equals("")) {
			keywordsErrorMessageList = ic.doCheck("検索ワード", keywords, 0, 50, true, true, true, true, false, true, true);
		}

		keywords = keywords.replaceAll("　+", " ").replaceAll(" +"," ").trim();    //全角スペース部分を半角スペースに置換。
		String[] keyword = keywords.split("\\s+");                                 //空白文字を区切りとして配列に格納。

		//カテゴリーと検索ワードを用いて商品情報を取得。
		if(categoryId.equals("1")){                                                //すべてのカテゴリーで検索している場合
			productInfoDTOList = dao.getProductInfoListByKeyword(keyword);
		}else{                                                                     //特定のカテゴリーを選んで検索している場合
			productInfoDTOList = dao.getProductInfoListByCategoryIdAndKeyword(keyword, categoryId);
		}

		return SUCCESS;
	}

	public Map<String,Object> getSession(){
		return this.session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public List<ProductInfoDTO> getProductInfoDTOList(){
		return this.productInfoDTOList;
	}

	public void setProductInfoDTOList(List<ProductInfoDTO> productInfoDTOList){
		this.productInfoDTOList = productInfoDTOList;
	}

	public List<String> getKeywordsErrorMessageList(){
		return this.keywordsErrorMessageList;
	}

	public void setKeywordsErrorMessageList(List<String> keywordsErrorMessageList){
		this.keywordsErrorMessageList = keywordsErrorMessageList;
	}

	public String getKeywords(){
		return this.keywords;
	}

	public void setKeywords(String keywords){
		this.keywords = keywords;
	}

	public String getCategoryId(){
		return this.categoryId;
	}

	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}
}
