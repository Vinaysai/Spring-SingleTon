package com.all.service;

import java.util.List;

import com.all.model.Customer;
import com.all.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.all.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		return customerRepository.findall();

	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
