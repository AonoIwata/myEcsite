package com.internousdev.green.dto;

import java.util.Date;

public class ProductInfoDTO {
    private int id;
	private int productId;
	private String productName;
	private String productKana;
	private String productDesc;
    private int categoryId;
    private int price;
    private String imageFilePath;
    private String imageFileName;
    private Date releaseDate;
    private String releaseCompany;

    public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

    public int getProductId(){
		return productId;
	}
	public void setProductId(int productId){
		this.productId=productId;
	}

	public String getProductName(){
		return productName;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}

	public String getProductKana(){
		return productKana;
	}
	public void setProductKana(String productKana){
		this.productKana=productKana;
	}

	public String getProductDesc(){
		return productDesc;
	}
	public void setProductDesc(String productDesc){
		this.productDesc=productDesc;
	}

	public int getCategoryId(){
		return categoryId;
	}
	public void setCategoryId(int categoryId){
		this.categoryId=categoryId;
	}

	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}

	public String getImageFilePath(){
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath){
		this.imageFilePath=imageFilePath;
	}

	public String getImageFileName(){
		return imageFileName;
	}
	public void setImageFileName(String imageFileName){
		this.imageFileName=imageFileName;
	}

	public Date getReleaseDate(){
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate){
		this.releaseDate=releaseDate;
	}

	public String getReleaseCompany(){
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany){
		this.releaseCompany=releaseCompany;
	}

}
