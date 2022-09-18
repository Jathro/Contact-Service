package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "Peter", "Slusarz", "0123456789", "123 Road");
		assertTrue(contact.getId().equals("1"));
		assertTrue(contact.getFirstName().equals("Peter"));
		assertTrue(contact.getLastName().equals("Slusarz"));
		assertTrue(contact.getAddress().equals("123 Road"));
		assertTrue(contact.getNumber().equals("0123456789"));
	}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Peter", "Slusarz", "0123456789", "123 Road");
		});
	}
	
	@Test
	void testContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678912", "Peter", "Slusarz", "0123456789", "123 Road");
		});
	}
		
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Peter123456", "Slusarz", "0123456789", "123 Road");
		});
	}
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Slusarz", "0123456789", "123 Road");
		});
	}
	
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Peter", "Slusarz1234", "0123456789", "123 Road");
		});
	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Peter", null, "0123456789", "123 Road");
		});
	}

	@Test
	void testContactPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Peter", "Slusarz", "01234", "123 Road");
		});
	}
	

	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Peter", "Slusarz", null, "123 Road");
		});
	}
	
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Peter", "Slusarz", "0123456789", "123 Road12345678901234567890123");
		});
	}
	

	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Peter", "Slusarz", "0123456789", null);
		});
	}
}
