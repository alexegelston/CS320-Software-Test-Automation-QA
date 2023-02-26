package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test public void idLength() {
	      Task task = new Task("More than 10 character", "Exercising", "Running");
	      System.out.println(task);
	   }
	
	@Test public void firstNameLength() {
	      Task task = new Task("0123456789", "The name of this task is invalid due to length for the purposes of the test", "Running");
	      System.out.println(task);
	   }
	
	@Test public void lastNameLength() {
	      Task task = new Task("0123456789", "The name of this task is invalid due to length for the purposes of the test", "Running");
	      System.out.println(task);
	   }
	
	@Test public void descriptionLength() {
	      Task task = new Task("0123456789", "Exercising", "The description of this task is invalid due to length for the purposes of the test");
	      System.out.println(task);
	   }

}
