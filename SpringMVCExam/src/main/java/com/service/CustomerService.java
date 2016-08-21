package com.service;

import java.util.List;

import com.entities.Address;
import com.entities.Customer;

public interface CustomerService {
	
	public Customer getCustomerByName(Customer customer);
	public List<Customer> getCustomers();
	public List<Address> getAddresses();
	public void insertCustomer(Customer customer);
}
