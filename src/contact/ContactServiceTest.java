package contact;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	ContactService cs;
	List<Contact> contacts;
	Contact contact;
	
	@BeforeEach
	public void setUp() {
		cs = new ContactService();
		contacts = new ArrayList<>();
		contact = new Contact("2", "Peter", "Slusarz", "0123456789", "123 Road");
		cs.addContact(contacts, contact);
	}
	
	@Test
	void testAddContact() {
		assertTrue(contacts.get(0).equals(contact));
	}
	
	@Test
	void testAddDuplicateContact() {
		int size = contacts.size();
		cs.addContact(contacts, contact);
		assertEquals(size, contacts.size());
	}
	
	@Test
	void testAddAdditionalContact() {
		int size = contacts.size();
		cs.addContact(contacts, new Contact("1", "John", "Smith", "0123456789", "123 Road"));
		assertEquals(size + 1, contacts.size());
	}
	
	@Test
	void testDeleteContact() {
		cs.deleteContact(contacts, "2");
		Assertions.assertEquals(-1, cs.findContact(contacts, contact));
	}
	
	@Test
	void testUpdateFirstName() {
		cs.updateContactFirstName(contacts, "2", "John");
		Assertions.assertTrue(contacts.get(0).getFirstName().equals("John"));
	}
	
	@Test
	void testUpdateLastName() {
		cs.updateContactLastName(contacts, "2", "Smith");
		Assertions.assertTrue(contacts.get(0).getLastName().equals("Smith"));
	}
	
	@Test
	void testUpdateNumber() {
		cs.updateContactNumber(contacts, "2", "3216549870");
		Assertions.assertTrue(contacts.get(0).getNumber() == "3216549870");
	}
	
	@Test
	void testUpdateAddress() {
		cs.updateContactAddress(contacts, "2", "321 Street");
		Assertions.assertTrue(contacts.get(0).getAddress() == "321 Street");
	}
}
