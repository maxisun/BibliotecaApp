package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Book;

@Repository
public class BookDAOImpl implements BookDAO{

	@PersistenceContext(name="capas")
	private EntityManager entityManager;
	
	@Override
	public List<Book> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.libro");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		List<Book> books = query.getResultList();
		return books;
	}
	
	@Override
	public List<Book> findDetailed(String selector, String input) throws DataAccessException {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE ");
		sb.append(selector);
		sb.append(" = :input");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter("input", input);
		List<Book> books = query.getResultList();
		return books;
	}

	@Override
	public List<Book> findDetailedCount(String selector, Integer input) throws DataAccessException {

		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE ");
		sb.append(selector);
		sb.append(" = :input");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter("input", input);
		List<Book>  books = query.getResultList();
		return books;

	}
	
	@Override
	public Integer countDetailed(String selector, String input) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE ");
		sb.append(selector);
		sb.append(" = :input");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter("input", input);
		Integer  numero = query.getResultList().size();
		return numero;
	}
	
	@Override
	public Integer countDetailedNumber(String selector, Integer input) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE ");
		sb.append(selector);
		sb.append(" = :input");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter("input", input);
		Integer  numero = query.getResultList().size();
		return numero;
	}

	@Override
	public BigInteger countBooks() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT SUM(quantity) FROM public.libro");
		Query query = entityManager.createNativeQuery(sb.toString());
		BigInteger numero = (BigInteger) query.getSingleResult();
		return numero;
	}
	
	@Override
	public BigInteger countAuthors() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select count(DISTINCT autor) from public.libro");
		Query query = entityManager.createNativeQuery(sb.toString());
		BigInteger numero = (BigInteger) query.getSingleResult();
		return numero;
	}
}
