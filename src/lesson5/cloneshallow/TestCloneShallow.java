package lesson5.cloneshallow;

import lesson5.clonedeep.Address;
import lesson5.clonedeep.Person;

public class TestCloneShallow {
	public static void main(String[] args) throws CloneNotSupportedException  
	{
	
        
		// Shallow copy of Cloning assign the objects instance references 
	     // Original Object 
	     Person addObj = new Person("Renuka", new Address("Apt. 1", "Utopia Park","West Avenue",52556));
	      
	      System.out.println("Before Cloning");
	      System.out.println(addObj);
	      
	     // Cloned Object 
	      Person cloAdd= (Person) addObj.clone(); 
	      System.out.println("After Cloning");
	     System.out.println(cloAdd);
	      
	      // Modify the object status using Cloned object which affect original object due to Shallow copy
	      addObj.getAddress().setHouseNo("20A");
	      System.out.println(addObj);
	   //  System.out.println("After Modifing the House No.");
	       System.out.println(cloAdd);
     
    
	}

}
