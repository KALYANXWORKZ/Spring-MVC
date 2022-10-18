package com.xworkz.criminals.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminals.dao.CriminalsDAO;
import com.xworkz.criminals.dto.CriminalsDTO;

@Repository
public class CriminalsDAOImpl implements CriminalsDAO {

	@Autowired
	private EntityManagerFactory factory;

	EntityManager manager;

	@Override
	public Boolean save(CriminalsDTO criminalsDTO) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(criminalsDTO);
			transaction.commit();

		} catch (PersistenceException e) {

			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public List<CriminalsDTO> findAll() {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<CriminalsDTO> resultList = query.getResultList();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.clear();
		}
		return findAll();
	}

}
