/*CS-320 Software Test Automation & QA
 * Alexander Egelston
 */

package main;

import java.util.ArrayList; //importing array list

public class ContactService {
		ArrayList<Contact> contacts; //array list for contacts

		public ContactService() {
			contacts = new ArrayList<>(); //setting contacts to new array list
		}

		public boolean addContact(Contact newContact) { //boolean operator template for adding contact I found on stack overflow from anonymous user
			boolean contains = false;
			for (Contact c : contacts) {
				if (c.getContactId().equalsIgnoreCase(newContact.getContactId())) {
					contains = true;
					break;
				}
			}

			if (!contains) {
				contacts.add(newContact); //adds new contact
				return true;
			} else {
				return false;
			}
		}

		public boolean deleteContact(String contactId) { //boolean operator for deleting contacts
			boolean deleted = false;
			for (Contact c : contacts) {
				if (c.getContactId().equalsIgnoreCase(contactId)) {
					contacts.remove(c); //removing contact
					deleted = true;
					break;
				}
			}
			return deleted;
		}

		public boolean updateContactFirstName(String contactId, String newFirstName) { //boolean operator for updating first name
			boolean updated = false;
			for (Contact c : contacts) {
				if (c.getContactId().equalsIgnoreCase(contactId)) {
					c.setFirstName(newFirstName); //sets new first name
					updated = true;
					break;
				}
			}
			return updated;
		}

		public boolean updateContactLastName(String contactId, String newLastName) { //boolean operator for updating last name
			boolean updated = false;
			for (Contact c : contacts) {
				if (c.getContactId().equalsIgnoreCase(contactId)) {
					c.setLastName(newLastName); //sets new last name
					updated = true;
					break;
				}
			}
			return updated;
		}

		public boolean updateContactNumber(String contactId, String newNumber) { //boolean operator for updating phone number
			boolean updated = false;
			for (Contact c : contacts) {
				if (c.getContactId().equalsIgnoreCase(contactId)) {
					c.setPhone(newNumber); //sets new phone number
					updated = true;
					break;
				}
			}
			return updated;
		}

		public boolean updateContactAddress(String contactId, String newAddress) { //boolean operator for updating address
			boolean updated = false;
			for (Contact c : contacts) {
				if (c.getContactId().equalsIgnoreCase(contactId)) {
					c.setAddress(newAddress); //sets new address
					updated = true;
					break;
				}
			}
			return updated;
		}

		public Object updateContact(String string, String string2, String string3, String string4, String string5) {
			// TODO Auto-generated method stub
			return null;
		}
}
