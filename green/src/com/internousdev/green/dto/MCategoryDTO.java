package com.internousdev.green.dto;

public class MCategoryDTO {

	private int id;
	private int categoryId;
	private String categoryName;
	private String categoryDesc;

	//idのgetterとsetter
	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id =id;
	}

	//categoryIdのgetterとsetter
	public int getCategoryId(){
		return this.categoryId;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	//categoryNameのgetterとsetter
	public String getCategoryName(){
		return this.categoryName;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	//categoryDescのgetterとsetter
	public String getCategoryDesc(){
		return this.categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc){
		this.categoryDesc = categoryDesc;
	}

}
