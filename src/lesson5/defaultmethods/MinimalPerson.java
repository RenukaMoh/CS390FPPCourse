package lesson5.defaultmethods;

public class MinimalPerson implements NameAddress {
	private String firstName, lastName, street, city, state;
	MinimalPerson(String firstName, String lastName, String street, String city, String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public String toString() {
		return getFullName() + "\n" + getFullAddress();
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
	public String getStreet() {
		return street;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public String getState() {
		return state;
	}
	
}
