package com.bridgelabz.addressbook;

public class Contact {
	private final String firstName;
	private final String lastName;
	private final String city;
	private final String state;
	private final String zip;
	private final String phoneNumber;
	private final String email;
	
	public Contact(String firstName, String lastName, String city, String state, String zip, String phoneNumber,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	
	
}
