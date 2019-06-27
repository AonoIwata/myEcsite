package com.internousdev.green.dto;

import java.util.Date;

public class PurchaseHistoryInfoDTO {
	private int id;
	/*商品情報テーブル*/
	private String productName;
	private String productKana;
	private String imageFilePath;
	private String imageFileName;
	private String releaseCompany;
	private Date releaseDate;

	/*購入履歴情報テーブル*/
	private String userId;
	private int productId;
	private int price;
	private int productCount;
	private int totalPrice;

	/*宛先情報テーブル*/
	private String familyName;
	private String firstName;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

    public String getImageFilePath(){
    	return imageFilePath;
    }

    public void setImageFilePath(String imageFilePath){
    	this.imageFilePath=imageFilePath;
    }

    public String getImageFileName(){
    	return this.imageFileName;
    }

    public void setImageFileName(String imageFileName){
    	this.imageFileName=imageFileName;
    }

    public String getReleaseCompany(){
    	return releaseCompany;
    }

    public void setReleaseCompany(String releaseCompany){
    	this.releaseCompany=releaseCompany;
    }

    public Date getReleaseDate() {
		return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
    }

    public int getPrice(){
    	return price;
    }

    public void setPrice(int price){
      this.price=price;
    }

    public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
    }

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId=userId;
    }

    public int getProductCount(){
		return productCount;
	}

	public void setProductCount(int productCount){
		this.productCount=productCount;
	}

	public int getTotalPrice(){
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice){
		this.totalPrice=totalPrice;
	}

    public String getFamilyName(){
    	return familyName;
    }

    public void setFamilyName(String familyName){
    	this.familyName=familyName;
    }

    public String getFirstName(){
    	return firstName;
    }

    public void setFirstName(String firstName){
    	this.firstName=firstName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }
}
