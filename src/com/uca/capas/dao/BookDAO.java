package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Book;

public interface BookDAO {

	public List<Book> findAll() throws DataAccessException;
	
	public List<Book> findDetailed(String selector, String input) throws DataAccessException;
	
	public Integer countDetailed(String selector, String input) throws DataAccessException;
	
	public List<Book> findDetailedCount(String selector, Integer input) throws DataAccessException;
	
	public Integer countDetailedNumber(String selector, Integer input) throws DataAccessException;
	
	public BigInteger countBooks() throws DataAccessException;
	
	public BigInteger countAuthors() throws DataAccessException;
}
