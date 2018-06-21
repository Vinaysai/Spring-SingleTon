package com.all.model;

public class Customer {

	private String message;
	private String privatemessage;

	public Customer() {
		super();
	}

	public String getMessage() {
		System.out.println("Your Message : " + message);

		return message;
	}

	public String getPrivatemessage() {
		System.out.println("Your PrivateMessage : " + privatemessage);

		return privatemessage;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setPrivatemessage(String privatemessage) {
		this.privatemessage = privatemessage;
	}

}
