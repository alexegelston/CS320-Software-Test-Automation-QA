package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	  
	@Test
	public void testAdd()
	{
	ContactService cs = new ContactService();
	Contact test1 = new Contact("1413252", "Jane", "Doe", "4444444444", "Sample 24 Drive");
	assertEquals(true, cs.addContact(test1));
	}

	@Test
	public void testDelete() {
	   ContactService cs = new ContactService();
	     
	Contact test1 = new Contact("5460986", "Joey", "Davis", "12345678", "Street road");
	Contact test2 = new Contact("0398723", "Michael", "Leyva", "987634534", "Park place");
	Contact test3 = new Contact("7465319", "Lily", "Egelston", "254698730", "South blvd");

	cs.addContact(test1);
	cs.addContact(test2);
	cs.addContact(test3);

	assertEquals(true, cs.deleteContact("0398723"));
	assertEquals(false, cs.deleteContact("0398723"));
	assertEquals(false, cs.deleteContact("0398723"));
	}

	@Test
	public void testUpdate() {
	ContactService cs = new ContactService();
	     
	Contact test1 = new Contact("5460986", "Joey", "Davis", "12345678", "Street road");
	Contact test2 = new Contact("0398723", "Michael", "Leyva", "987634534", "Park place");
	Contact test3 = new Contact("7465319", "Lily", "Egelston", "254698730", "South blvd");

	cs.addContact(test1);
	cs.addContact(test2);
	cs.addContact(test3);

	assertEquals(true, cs.updateContact("7465319", "LilyFirst", "EgelstonLast", "254698730", "South blvd"));
	assertEquals(false, cs.updateContact("7465319", "LilyFirst", "EgelstonLast", "254698730", "South blvd"));
	}
}
