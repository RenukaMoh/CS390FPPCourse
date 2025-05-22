package lesson5.defaultmethods;

public class PersonInDetail implements NameAddress {
	private String firstName, middleName, lastName;
	private Address address;
	PersonInDetail(String fn, String mn, String ln, Address add) {
		this.firstName = fn;
		this.middleName = mn;
		this.lastName = ln;
		this.address= add;
	}
	public String toString() {
		return getFullName() + "\n" + getFullAddress();
	}
	@Override
	public String getStreet() {
		return address.getStreet1();
	}
	@Override
	public String getCity() {
		return address.getCity();
	}
	@Override
	public String getState() {
		return address.getState();
	}
	@Override
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String getLastName() {
		return lastName;
	}
	@Override
	public String getFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	@Override
	public String getFullAddress() {
		return address.toString();
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
