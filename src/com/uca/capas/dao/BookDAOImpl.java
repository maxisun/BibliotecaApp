package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Book;

public class BookDAOImpl implements BookDAO{

	@PersistenceContext(name="capas")
	private EntityManager entityManager;
	
	@Override
	public List<Book> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		//sb.append("select * from public.student where b_active='true'");
		sb.append("select * from public.libro");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		List<Book> resulset = query.getResultList();
		return resulset;
	}
	
	@Override
	public Book findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		Book student = entityManager.find(Book.class, code);
		return student;
	}
}
