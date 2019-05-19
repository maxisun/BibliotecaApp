package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(schema = "public", name = "libro")
@SuppressWarnings("deprecation")
public class Book {
	
	@Id
	@Column(name = "isbn")
	@NotEmpty(message = "please insert book isbn")
	@NotNull
	@Size(message = "maximun lenght is 100 characters",min = 1, max = 100)
	private String isbn;
	
	@Column(name = "titulo")
	@NotEmpty(message = "please insert book title")
	@NotNull
	@Size(message = "maximun lenght is 100 characters",min = 1, max = 100)
	private String title;
	
	@Column(name = "autor")
	@NotEmpty(message = "please insert book author")
	@NotNull
	@Size(message = "maximun lenght is 100 characters",min = 1, max = 100)
	private String author;
	
	@Column(name = "quantity")
	@NotNull(message="please insert book quantity")
	@PositiveOrZero(message = "quantity must be a positive number or zero")
	@Digits(message = "insert a valid book quantity", integer = 300, fraction = 0)
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
