package com.bookLibrary.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public int id;
	
	@Column(name="email")
	public String email;
	
	@Column(name="password")
	public String password;
	
	@Column(name="buyer")
	public String buyer;
	
	@Column(name="seller")
	public String seller;
}