package com.one2many.demo.daos;


public class AddressDao {

	private String houseNumber;

	private String street;

	private String area;

	private String city;

	private String zipCode;

	public AddressDao() {
		super();
	}

	public AddressDao(String houseNumber, String street, String area, String city, String zipCode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.area = area;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	

}
