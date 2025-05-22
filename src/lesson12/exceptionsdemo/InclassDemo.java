package lesson12.exceptionsdemo;

import java.util.Scanner;
public class InclassDemo {
	public static void main(String[] args) {
		// Unchecked Exceptions - Run time Exceptions
		// 1. Arithmetic Exception
		int d = 0;
		if(d==0) throw new ArithmeticException("Can't divide by zero");
		//   System.out.println(10/d);
		System.out.println("End");
		// 2. NullPointerException
		String s=null;
		//System.out.println(s.length());
		// 3. ClassCastException
				Object o = Integer.valueOf(30);
			//	String s1 = (String)o;
		// 4. ArrayIndexOutOfBoundsException
		String[] col = new String[3]; // access 0 to 2
			System.out.println(col[3]);
		
		 //5. NumberFormatException - Paring may face this situation
	     String num = "20s";//"20" No issue
		// int a = Integer.parseInt(num);
		//int a = Integer.valueOf(num);
		//6. InputMismatchException - Get the input the form the console
				Scanner input = new Scanner(System.in);
				System.out.println("Enter a int value");
				int b = input.nextInt();
	}
}
