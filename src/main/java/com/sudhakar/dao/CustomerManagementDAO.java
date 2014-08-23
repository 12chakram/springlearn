package com.sudhakar.dao;

import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

import com.sudhakar.data.Customer;

public class CustomerManagementDAO {
	
	private HibernateTransactionManager transactionManager;
	
	public HibernateTransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(HibernateTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public boolean addCustomer(Customer customer){
		Session session = transactionManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		try{
			session.persist(customer);
			session.getTransaction().commit();
		  return true;
		}catch(Exception exception){
			return false;
		}
		
	}

}
