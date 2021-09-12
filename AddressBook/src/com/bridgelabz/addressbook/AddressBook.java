package com.bridgelabz.addressbook;


import java.util.*;
 
public class AddressBook {
	private HashMap<String, Contact> contacts;
	private HashMap<String, ArrayList<Contact>> contactsByCity;
	private HashMap<String, ArrayList<Contact>> contactsByState;
	Scanner sc = new Scanner(System.in);
	private int numOfContacts;
	
	
	public AddressBook() {
		this.contacts = new HashMap<String, Contact>();
		this.contactsByCity = new HashMap<>();
		this.contactsByState = new HashMap<>();
		this.numOfContacts = 0;
	}
	public void findContactInCity(String cityName) {
		for(Contact contact: contacts.values()) {
			if(contact.getCity().equals(cityName)) {
				System.out.println("Name : "+contact.getFirstName()+"-> City : "+cityName);
			}
		}

	}
	
	public void findContactInState(String stateName) {
		for(Contact contact: contacts.values()) {
			if(contact.getState().equals(stateName)) {
				System.out.println("Name : "+contact.getFirstName()+"-> State : "+stateName);
			}
		}

	}

	public void editContact() {
		System.out.println("Enter the first name of the contact to edit");
		String firstName = sc.next();
		Contact contactToChange = contacts.get(firstName);
		if(contactToChange == null) {
			System.out.println("contact does not exist");
			return;
		}
		System.out.println("Select the options \t 1.first name \t 2.last name \t 3.city \n 4.state \t 5.zip \t 6.phone number \t 7.email");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("enter new first name");
			String newFirstName = sc.next();
			contactToChange.setFirstName(newFirstName);
			break;
		case 2:
			System.out.println("Enter new last name");
			String newLastName=sc.next();
			contactToChange.setLastName(newLastName);
			break;
		case 3:
			System.out.println("Enter new city");
			contactToChange.setCity(sc.next());
			break;
		case 4:
			System.out.println("Enter new state");
			contactToChange.setState(sc.next());
			break;
		case 5:
			System.out.println("Enter new zip");
			contactToChange.setZip(sc.next());
			break;
		case 6:
			System.out.println("Enter new phone number");
			contactToChange.setPhoneNumber(sc.next());
			break;
		case 7:
			System.out.println("Enter new email");
			contactToChange.setEmail(sc.next());
			break;
		default:
			System.err.println("Invalid Option");
				
		}
			System.out.println("Editing done, the new details are: ");
			System.out.println(contactToChange.getFirstName()+" "+contactToChange.getLastName()+" "+contactToChange.getCity()+" "+contactToChange.getState()+" "+contactToChange.getZip()+" "+contactToChange.getPhoneNumber()+" "+contactToChange.getEmail());
			
		
}
		
	public void deleteContact() {
		System.out.println("Enter first name and phone number of person you want to delete:");
		String firstName = sc.next();
		if(contacts.remove(firstName) != null) {
			System.out.println("Successfully Deleted");
		}
		else
			System.out.println("Person does not exist"); return;
		
	}
	
	public void addContact() {
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
		
		Contact contact = new Contact(firstName,lastName,city,state,zip,phoneNumber,email);
		if (contacts.get(firstName) == null) {
			contacts.put(firstName, contact);
			numOfContacts++;
		} else {
			System.out.println("DUPLICATE ENTRY: Name entered already exists");
			return;
		}
		if(contactsByCity.get(city) == null) {
			contactsByCity.put(city,new ArrayList<>());
		}
		contactsByCity.get(city).add(contact);
		
		if(contactsByCity.get(state) == null) {
			contactsByCity.put(state,new ArrayList<>());
		}
		contactsByCity.get(state).add(contact);

	}
}
