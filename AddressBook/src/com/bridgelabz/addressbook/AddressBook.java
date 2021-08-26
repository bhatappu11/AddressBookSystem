package com.bridgelabz.addressbook;


import java.util.HashMap;
import java.util.Scanner;
 
public class AddressBook {
	private HashMap<String,Contact> addressBook = new HashMap<String,Contact>();
	public void addContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter contact details");
		System.out.println("Enter first name");
		String firstName = sc.nextLine();
		System.out.println("Enter last name");
		String lastName = sc.nextLine();
		System.out.println("Enter city");
		String city = sc.nextLine();
		System.out.println("Enter state");
		String state = sc.nextLine();
		System.out.println("Enter zip");
		String zip = sc.nextLine();
		System.out.println("Enter phone number");
		String phoneNumber = sc.nextLine();
		System.out.println("Enter email");
		String email = sc.nextLine();
		
		addressBook.put(firstName,new Contact(firstName,lastName,city,state,zip,phoneNumber,email));
		sc.close();
	}
}
