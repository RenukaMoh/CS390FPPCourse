package lesson8.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringArray = new ArrayList<String>(
				Arrays.asList("Hello", "Welcome", "Java","Object", "Array", "String", "Inheritance","Swing"));
		Collections.sort(stringArray);
		System.out.println(stringArray);
		int pos = Collections.binarySearch(stringArray, "Java1");
		System.out.println(pos);
		//System.out.println("Reversed List");
	//	Collections.sort(stringArray,Collections.reverseOrder());
	//	System.out.println(stringArray);
	}

}
