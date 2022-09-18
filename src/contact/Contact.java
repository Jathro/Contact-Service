package contact;

public class Contact {
		private String id;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String address;
		
		public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
			
			
			if (id == null || id.length() > 10) {
				throw new IllegalArgumentException("Invalid id");
			}
			
			this.id = id;
			setFirstName(firstName);
			setLastName(lastName);
			setNumber(phoneNumber);
			setAddress(address);
		}
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		} 
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}
	
	public void setNumber(String number) {
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phoneNumber = number;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getNumber() {
		return phoneNumber;
	}
}