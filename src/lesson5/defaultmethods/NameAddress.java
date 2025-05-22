package lesson5.defaultmethods;

public interface NameAddress {
	// 5 Unimplemented Methods
	String getFirstName(); // public abstract
	String getLastName();
	String getStreet();
	String getCity();
	String getState();
	// 2 Implemented Methods
	default String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	default String getFullAddress() {
		return getStreet() + "\n" + getCity() + ", " + getState();
	}
	
}
