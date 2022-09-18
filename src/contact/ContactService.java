package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	public static void main(String[] args) {
		
		List<Contact> contacts = new ArrayList<>();
		
	}

	static void addContact(List<Contact> contacts, Contact newContact) {
		
		if (contacts.size() == 0) {
			contacts.add(newContact);
			// System.out.println("contact added to empty list");
			return;
		}
		
		for (Contact contact : contacts) {
			if (contact.getId().equals(newContact.getId())) {
				// System.out.println("contact exists");
				return;
			}
			else
			{
				contacts.add(newContact);
				// System.out.println("contact added to list");
				return;
			}
		}
	}
	
	static void deleteContact(List<Contact> contacts, String id) {
		
		if (contacts.size() == 0) {
			// System.out.println("list empty nothing to delete");
			return;
		}
		
		for (Contact contact : contacts) {
				contacts.removeIf(c -> c.getId().equals(id));
				// System.out.println("contact exists and is deleted");
				return;
		}
	}
	
	static int findContact(List<Contact> contacts, Contact contact) {
		for (Contact c : contacts) {
			return contacts.indexOf(contact);
		}
		return -1;
	}
	
	static void updateContactFirstName(List<Contact> contacts, String id, String s) {

		for (Contact contact : contacts) {
			if (contact.getId().equals(id)) {
				contact.setFirstName(s);
			}
		}
	}
	
	static void updateContactLastName(List<Contact> contacts, String id, String s) {

		for (Contact contact : contacts) {
			if (contact.getId().equals(id)) {
				contact.setLastName(s);
			}
		}
	}
	
	static void updateContactNumber(List<Contact> contacts, String id, String s) {

		for (Contact contact : contacts) {
			if (contact.getId().equals(id)) {
				contact.setNumber(s);
			}
		}
	}
	
	static void updateContactAddress(List<Contact> contacts, String id, String s) {

		for (Contact contact : contacts) {
			if (contact.getId().equals(id)) {
				contact.setAddress(s);
			}
		}
	}
}