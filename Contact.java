/*CS-320 Software Test Automation & QA
 * Alexander Egelston
 */

package main;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactId, String fName, String lName, String phoneNumber, String address){
		if(contactId != null && contactId.length() <10) {
			this.contactId = contactId;
		}
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setPhone(phoneNumber);
		this.setAddress(address);
	}
	
	public void setContactId(String input){
        this.contactId = input;
	}
	
	public String getFirstName(){ //get first name method
        return firstName;
	}
	
	public void setFirstName(String fName) {
		if(fName != null && fName.length() <= 10) {
			this.firstName = fName;
		}
	}
	
	public String getLastName(){ //get last name method
        return lastName;
    }
	
	public void setLastName(String lName) {
		if(lName != null && lName.length() <= 10) {
			this.lastName = lName;
		}
	}
	
	public String getPhone(){ //get phone number method
        return phoneNumber;
    }
	
	public void setPhone(String phoneNumber) {
		if(phoneNumber != null && phoneNumber.length() <= 10) {
			this.phoneNumber = phoneNumber;
		}
	}
	
	public String getAddress(){ //get address method
        return address;
    }
	
	public void setAddress(String address) {
		if(address != null && address.length() <= 30) {
			this.address = address;
		}
	}

	public String getContactId() {
		// TODO Auto-generated method stub
		return contactId;
	}
}