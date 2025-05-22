package lesson12.exceptionsdemo;

import java.util.Scanner;

public class CustomExceptionTest {
	public static void main(String[] args) throws Below18AgeException {

		String[] col = new String[3]; // access 0 to 2
		System.out.println(col[3]);
		/*Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter Age");
		x = sc.nextInt();
		if(x<=18)
		//	throw  // own exception related to my application
		throw new Below18AgeException("Age should be 18 or above");*/

	}

}
