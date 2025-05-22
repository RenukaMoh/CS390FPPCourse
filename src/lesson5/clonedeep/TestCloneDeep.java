package lesson5.clonedeep;

public class TestCloneDeep {
	public static void main(String[] args) throws CloneNotSupportedException 
	{
	
    // Deep copy of Cloning copy the objects instance references too
      
      Person addObj = new Person("Renuka", new Address("Apt. 1", "Utopia Park","West Avenue",52556));
      
      System.out.println("Before Cloning");
      System.out.println(addObj);
      
      Person cloAdd= (Person) addObj.clone(); 
      System.out.println("After Cloning");
      System.out.println(cloAdd);
      
     addObj.getAddress().setHouseNo("11A");
     System.out.println("After Modifing the House No.");
     
     System.out.println("Cloned Object :" + cloAdd);
     System.out.println("Original Object :" + addObj);
     
    
	}
}
