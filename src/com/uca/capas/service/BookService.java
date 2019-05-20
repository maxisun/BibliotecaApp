package com.uca.capas.service;

import java.math.BigInteger;
import java.util.List;

import com.uca.capas.domain.Book;

public interface BookService {

	public List<Book> findAll();
	
	public List<Book> findDetailed(String selector, String input);
	
	public String capital(String capital);
	
	public Integer countDetailed(String selector, String input);
	
	public BigInteger countBooks();
	
	public BigInteger countAuthors();
}
