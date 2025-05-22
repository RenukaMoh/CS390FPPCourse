package lesson11.inclassexercise;
import java.util.*;
public class Subarray {

	public static void main(String[] args) {
		String[] arr1 = {"A", "C", "E"};
		String[] arr2 = {"A", "B", "C", "D", "E"};
		String[] arr3 = {"A", "C", "F"};
		System.out.println("Is arr1 a subarray of arr2? "
				+ "(Expected answer: yes) " + isSubArray(arr1, arr2));
		System.out.println("Is arr3 a subarray of arr2? "
				+ "(Expected answer: no) " + isSubArray(arr3, arr2));
	}
	
	/**
	 * Returns true if every string in arr1 is contained
	 * in arr2. Assume that neither array is null.
	 */
	public static boolean isSubArray(String[] arr1, String[] arr2) {
		var h = new HashMap<String, String>();
		
		//Loads arr2 elements into h
		for(String s : arr2) {
			h.put(s, s);
		}
		//Checks whether each element of arr1 is a key in h
		for(String s: arr1) {
			if(!h.containsKey(s)) return false;
		}
		return true;
	}
}
