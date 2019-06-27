package com.internousdev.green.dto;

public class DestinationInfoDTO {

	private int id;
	private String userId;
	private String familyName;
	private String firstName;
	private String familyKana;
	private String firstKana;
	private String email;
	private String telNumber;
	private String address;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFamilyKana(){
		return familyKana;
	}

	public void setFamilyKana(String familyKana){
		this.familyKana = familyKana;
	}

	public String getFirstKana(){
		return firstKana;
	}

	public void setFirstKana(String firstKana){
		this.firstKana = firstKana;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getTelNumber(){
		return telNumber;
	}

	public void setTelNumber(String telNumber){
		this.telNumber = telNumber;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address = address;
	}

}
