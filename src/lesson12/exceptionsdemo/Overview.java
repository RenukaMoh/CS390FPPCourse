package lesson12.exceptionsdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// You will get the knowledge this Overview in Lesson-12

public class Overview {
	public static void main(String args[]) {
		// 1. Checked Exception, IOException -Compiler enforced the developer to deal or simplt throws
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
	//	String inp = ob.readLine();
		/* 2. No compilation error - After running the code you will some message on the console
		After this the remaining part of your code will not execute
		It's called Unchecked/Runtime Exception. */
		//System.out.println(12/0);
		System.out.println("End");// Next line after the Exception
 	
	/* 3. Error class --> Not fixed or can't handle by the developer
	 Example - StackOverFlowError - Developer fix through logic
	 Developer can't not handle this or throw it
	*/
		//getData();
	
	// Call the readInput() method
	/*	try {
			readInput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	String t = "Hello";
	for(int i=0;i<10; i++) {
		t = fun(t); // Out of memory error
			}
}
	
/*	public static void getData()  {
		getData();
	 }
	*/
	/*public static void readInput() throws IOException {
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		String inp = ob.readLine();
	}*/
	public static String fun(String s) {
		 return s + s;
	}
}