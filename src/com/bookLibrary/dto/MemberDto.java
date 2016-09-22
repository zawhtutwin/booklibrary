package com.bookLibrary.dto;

import java.io.Serializable;


public class MemberDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public int id;
	
	public String email;
	
	public String password;
	

	public String buyer;
	

	public String seller;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getBuyer() {
		return buyer;
	}


	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}


	public String getSeller() {
		return seller;
	}


	public void setSeller(String seller) {
		this.seller = seller;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
