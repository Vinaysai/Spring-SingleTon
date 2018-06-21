package com.all.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.all.model.Customer;

public class Application {

	/*
	 * prototype
	 * 
	 * This scopes a single bean definition to have any number of object instances.
	 * 
	 */

	public static void main(String[] args) {

		// CustomerService service = new CustomerServiceImpl();

		@SuppressWarnings("resource")
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Customer cust = (Customer) appCtx.getBean("Customer");

		cust.setMessage("Your Message is:::Im <<<<<<Vinaysai>>>>>>");

		cust.getMessage();

		Customer custs = (Customer) appCtx.getBean("Customer");

		custs.setPrivatemessage("Your Private Message is:::Im just <<<<<<Vinaysai>>>>>> And Im Good.....");
		custs.getPrivatemessage();
		// No instance.
		// Second Instance Gives Null.WithOut Setter.

		Customer cust1 = (Customer) appCtx.getBean("Customer");

		// With Setter Instance is created...
		// cust1.setMessage("Vinaysai");
		cust1.getMessage();

		// Second Instance Gives Null.WithOut Setter.

		Customer custs1 = (Customer) appCtx.getBean("Customer");

		custs1.getPrivatemessage();

	}

}
