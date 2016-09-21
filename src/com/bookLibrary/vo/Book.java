package com.bookLibrary.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public int id;

	@Column(name="title")
	public String title;
	
	@Column(name="author")
	public String author;
	
	@Column(name="price")
	public float price;
	
}
