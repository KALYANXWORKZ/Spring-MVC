package com.xworkz.milkshop.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;
@Repository
public class MilkShopImpl implements MilkShopDAO {
	@Autowired
	private EntityManagerFactory factory;
	
	public MilkShopImpl() {

	System.out.println("created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(MilkShopDTO milkShopDTO) {

		EntityManager manager = factory.createEntityManager();
		
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(milkShopDTO);
			transaction.commit();
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return true;
	}

}
