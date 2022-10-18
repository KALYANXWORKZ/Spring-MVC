package com.xworkz.shirtdetails.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.shirtdetails.dao.ShirtDAO;
import com.xworkz.shirtdetails.dto.ShirtDTO;

@Repository
public class ShirtDAOImpl implements ShirtDAO {
	@Autowired
	private EntityManagerFactory factory;
	
	public ShirtDAOImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ShirtDTO dto) {
		EntityManager manager = factory.createEntityManager();
		try {
			
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		 
		return true;
	}

}
