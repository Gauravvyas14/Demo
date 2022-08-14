package com.one2many.demo.daos;

import java.util.List;

public class EmployeeDao {

	private String firstName;

	private String lastName;

	private List<AddressDao> addressList;

	private String email;

	private String phone;

	public EmployeeDao() {
		super();
	}

	public EmployeeDao(String firstName, String lastName, List<AddressDao> addressList, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressList = addressList;
		this.email = email;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<AddressDao> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressDao> addressList) {
		this.addressList = addressList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
