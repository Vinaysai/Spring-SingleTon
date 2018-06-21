package com.all.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

	private Set addressSet;
	private List addressList;
	private Map addressMap;
	private Properties addressProp;

	public Customer() {
		super();
	}

	public List getAddressList() {
		System.out.println("List Elements :" + addressList);
		return addressList;
	}

	public Map getAddressMap() {
		System.out.println("Map Elements :" + addressMap);

		return addressMap;
	}

	public Properties getAddressProp() {
		System.out.println("Property Elements :" + addressMap);

		return addressProp;
	}

	public Set getAddressSet() {
		System.out.println("Set Elements :" + addressSet);

		return addressSet;
	}

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

}
