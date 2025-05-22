package lesson8.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestStudent {
	public static void main(String[] args) {
		  Student s1 = new Student("Tim",1234,80);
		  Student s2 = new Student("Amar",1456,90);
		  Student s3 = new Student("Bruck",1111,92);
		  Student s4 = new Student("Carol",1222,81);
		  Student s5 = new Student("James",1212,100);
		  List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
		  Student temp = new Student("Tim",1234,80);
		  Student temp1 = new Student("Tim",1224,90);
		  // Compare two student objects are equal
		  boolean res = s1.equals(temp);
		  System.out.println("s1 and temp equals = " + res);
		  
		  StudentComparator ob = new StudentComparator();
		  int com = ob.compare(s1, temp);
		  if(com==0)
			  System.out.println("Both are same");
		  else
			  System.out.println("Not same object");
		  // Compare temp and temp1
		  res = temp.equals(temp1);
		  System.out.println(" temp and temp1 equals = " + res);
		  
		  com = ob.compare(temp, temp1);
		  if(com==0)
			  System.out.println("Both are same");
		  else
			  System.out.println("Not same object");
	}

}
