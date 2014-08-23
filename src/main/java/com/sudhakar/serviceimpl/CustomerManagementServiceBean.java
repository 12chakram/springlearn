package com.sudhakar.serviceimpl;

import com.sudhakar.dao.CustomerManagementDAO;
import com.sudhakar.data.Customer;
import com.sudhakar.service.CustomerManagementService;

public class  CustomerManagementServiceBean implements CustomerManagementService{

	private CustomerManagementDAO customerManagementDao; 
	
	public CustomerManagementDAO getCustomerManagementDao() {
		return customerManagementDao;
	}

	public void setCustomerManagementDao(CustomerManagementDAO customerManagementDao) {
		this.customerManagementDao = customerManagementDao;
	}

	public boolean addCustomerService(Customer customer) {
		return customerManagementDao.addCustomer(customer);
	}

}
