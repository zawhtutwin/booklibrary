package com.bookLibrary.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bookLibrary.vo.Book;


@Repository("bookDao")
@Transactional(value = "transactionManager",propagation = Propagation.REQUIRES_NEW)
public class BookDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Book> getAllBooks() {
		Query q = entityManager.createQuery("select b from Book b",Book.class);
		return (List<Book>)q.getResultList();
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
