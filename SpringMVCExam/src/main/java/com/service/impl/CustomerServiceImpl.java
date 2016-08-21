package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.entities.Address;
import com.entities.Customer;
import com.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public Customer getCustomerByName(Customer customer) {
		return customerDao.getCustomerByName(customer);
	}

	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	public List<Address> getAddresses() {
		return customerDao.getAddresses();
	}

	public void insertCustomer(Customer customer) {
		customerDao.insertCustomer(customer);
		
	}

}
