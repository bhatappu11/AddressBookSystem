package com.bridgelabz.addressbook;

import java.util.*;

public class AddressBookMain {
	private static HashMap<String, AddressBook> addressBooks;
	
	public AddressBookMain() {
		this.addressBooks = new HashMap<>();
	}

	
	public void searchAcrossByCity(String city) {
		for(AddressBook addressBook : addressBooks.values()) {
			addressBook.findContactInCity(city);
		}
	}
	
	public void searchAcrossByState(String state) {
		for(AddressBook addressBook : addressBooks.values()) {
			addressBook.findContactInState(state);
		}
	}
	
	private static void addressMenu(AddressBook addressBook) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean exit = true;
		while(exit) {
			System.out.println("Select option \n1: Add Contact.  \n2: Edit Existing Contact. \n3:Delete contact.");
			option  = sc.nextInt();
			switch(option) {
			case 1 :
				addressBook.addContact();
				break;
			case 2 :
				System.out.println("Enter the details to edit");
				addressBook.editContact();
				break;
			case 3:
				System.out.println("Enter the details to edit: ");
				addressBook.deleteContact();
				break;
			default:
				exit = false;

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");
		AddressBookMain addressBookMain = new AddressBookMain();
		Scanner sc = new Scanner(System.in);
		boolean exit1 = true;
		while(exit1) {
			System.out.println("Select option 1:Add address Book 2:open Address Book 3:Search in AddressBooks 4:Exit");
			switch(sc.nextInt()) {
			case 1: 
				System.out.println("Enter the address book name");
				String name = sc.next();
				AddressBook addressBook = new AddressBook();
				addressBooks.put(name, addressBook);
				break;
			case 2:
				System.out.println("Enter the name of Address Book");
				String book = sc.next();
				if(addressBooks.get(book)==null)
					System.out.println("Address Book does not exist");
				else {
					AddressBook bookName = addressBooks.get(book);
					addressMenu(bookName);
				}
				break;
			case 3:
				System.out.println("Options: 1.search by city 2:search by state");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.println("Enter city name");
					addressBookMain.searchAcrossByCity(sc.next());
				}
				else if(choice==2) {
					System.out.println("Enter state name");
					addressBookMain.searchAcrossByState(sc.next());
				}
				else
					System.out.println("Invalid choice");
				break;
			default:
				exit1 = false;

			}
	}

	}
}
