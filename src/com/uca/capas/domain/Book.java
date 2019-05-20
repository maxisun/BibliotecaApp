package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "libro")
public class Book {
	
	@Id
	@Column(name = "isbn")
	private String isbn;
	
	@Column(name = "titulo")
	private String title;
	
	@Column(name = "autor")
	private String author;
	
	@Column(name = "quantity")
	private Integer quantity;

	public Book() {

	}
	
	public Book(String isbn, String title, String author, Integer quantity) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
