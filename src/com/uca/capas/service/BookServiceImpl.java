package com.uca.capas.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookDAO bookDao;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	@Override
	public List<Book> findDetailed(String selector, String input) {
		if(selector.equals("quantity")) {
			int a = Integer.parseInt(input);
			return bookDao.findDetailedCount(selector, a);
		}
		// TODO Auto-generated method stub
		return bookDao.findDetailed(selector, input);
	}

	@Override
	public String capital(String capital) {
		String ready =capital.substring(0, 1).toUpperCase() + capital.substring(1);
		return ready;
	}

	@Override
	public Integer countDetailed(String selector, String input) {
		// TODO Auto-generated method stub
		if(selector.equals("quantity")) {
			int a = Integer.parseInt(input);
			return bookDao.countDetailedNumber(selector, a);
		}
		return bookDao.countDetailed(selector, input);
	}

	@Override
	public BigInteger countBooks() {
		return bookDao.countBooks();
	}

	@Override
	public BigInteger countAuthors() {
		// TODO Auto-generated method stub
		return bookDao.countAuthors();
	}

}
