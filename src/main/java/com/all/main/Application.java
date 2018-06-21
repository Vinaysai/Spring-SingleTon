package com.all.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.all.model.Customer;

public class Application {

	public static void main(String[] args) {

		// CustomerService service = new CustomerServiceImpl();

		@SuppressWarnings("resource")
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Customer cust = (Customer) appCtx.getBean("Customer");
		cust.getAddressList();
		cust.getAddressSet();
		cust.getAddressMap();
		cust.getAddressProp();

	}

}
