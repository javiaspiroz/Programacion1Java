package lesson6.year16_17;

import java.util.Scanner;

/**
 * An example of a main class using the Contact objects and declaring also some static methods
 * Maybe a better solution would have been to declare a PhoneBook object with those methods inside it.
 * Deciding what approach to follow depends on the complexity of the program to be done and also on
 * the programmer preferences, but in Java it is encouraged to use objects instead of working with static methods.
 * As we don´t expect these methods to be used in another program, we declare them as private, but they could
 * be public as well
 * @author Angel Garcia Olaya. PLG-UC3M
 * @since November 2016
 * @version 1.0
 *
 */
public class PhoneBook {
	
	/**
	 * Finds a contact in a list of Contact objects by his/her name
	 * @param list the list of Contact objects (it can have null positions)
	 * @param name the of the contact
	 * @return the position of the contact or -1 if it is not found
	 */
	private static int findContact (Contact [] list, String name){
		for (int ii=0; ii<list.length; ii++){
			//If the element is null it means we didn't find the contact in the previous ones,
			//so we return false
			if (list[ii]==null) return -1;
			if(list[ii].getName().equals(name)) return ii;
			}
		return -1;
	}
	
	/**
	 * Adds a contact to a phoneBook if the contact doesn't exist
	 * @param list the list of contacts
	 * @param the contact to add
	 * @return true if the contact was added (there is space available and it is not already on the list)
	 */
	private static boolean addContact (Contact [] list, String name){
		//If the contact is found, we don´t add it
		if (findContact(list, name)!=-1) return false;
		//Looking where to store the contact 
		boolean added = false;
		for (int ii=0; ii<list.length && !added; ii++){
			//We look for the first element that is null (empty position)
			if (list[ii]==null) {
				list[ii]= new Contact(name);
				added = true;
			}
		}
		//If added is still false it is because there are no empty positions
		return added;
	}
	
	/**
	 * Shows the name and phone numbers of a Contact (invoking the toString method)
	 * @param list the list of contact
	 * @param name the name of the contact
	 * @return the result of invoking the toString method of a Contact object if the contact belongs to the list,
	 * null if it doesn't belong
	 */
	private static String showDetails (Contact [] list, String name){
		//We find the user
		int position = findContact(list, name);
		//If not found, we return null
		if (position==-1)
			return null;
		//We return the details invoking the toString method
		else
			return list[position].toString();
	}
	
	/**
	 * Adds a phone number to a Contact object by invoking the addNumber method of the object
	 * @param phoneBook the list of Contacts
	 * @param name the name of the contact
	 * @param phone the phone to add
	 * @return true if the phone was added, false if not (the contact doesn't exist or the number is already stored)
	 */
	private static boolean addPhone(Contact[] phoneBook, String name, int phone) {
		//We find the user
		int position = findContact(phoneBook, name);
		if (position==-1) return false;
		else {
			//Maybe the user has this phone already
			boolean added = phoneBook[position].addNumber(phone);
			return added;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//We create the array with 200 positions instead of making it grow
		Contact [] phoneBook = new Contact [200];
		boolean end = false;
		do {
			System.out.println("Enter your option");
			System.out.println("1: to add a new contact");
			System.out.println("2: to add a new phone to a contact");
			System.out.println("3: to see the details of a contact");
			System.out.println("4: to finish");
			byte option = sc.nextByte();
			switch (option){
			case 1: System.out.println("Enter the name of the contact");
					String name = sc.next();
					if (addContact(phoneBook,name))
						System.out.println("Contact added");
					else 
						System.out.println("Contact not added");
					break;
			case 2: System.out.println("Enter the name of the contact and the phone to be added");
					name = sc.next();
					int phone = sc.nextInt();
					if (addPhone(phoneBook,name,phone))
						System.out.println("The phone was added");
					else
						System.out.println("Problems adding the phone");
					break;
			case 3: System.out.println("Enter the name of the contact");
					name = sc.next();
					String details = showDetails(phoneBook,name);
					if (details==null)
						System.out.println("No such contact!");
					else
						System.out.println(details);
					break;
			default: System.out.println("Exiting...");
					 end = true;
			}
		}
		while (!end);
		sc.close();
	}



}
