package lesson5.clonedeep;

public class Person implements Cloneable 
{

	  private String name;
	  private Address address;
	  
	  public Person(){
	    
	  }
		  public Person(String name, Address add)
	  {
		  this.name = name;
		  this.address = add;
		  
	  }
		  
	  public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
	public String toString()
	  {
		  String ot = this.name + "\n I am Living in  " + address.houseNo + " " + address.address1 + " " + address.address2 + " " + address.zipcode;
	      return ot; 
	  }
      @Override
	  public Person clone() throws CloneNotSupportedException {

    	  Person clone=(Person)super.clone();
	    
	 // Need to clone the Address reference variable too
	   clone.address = (Address)this.address.clone();
	   
	    return clone;

	  }
}