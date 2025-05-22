package lesson12.exceptionsdemo;

import java.io.IOException;
import java.util.InputMismatchException;

public class TryCatchFormat {

	public static void main(String[] args) {

		// 1. try, catch()
		try {
			// Exception code
		}
		catch(InputMismatchException e) {
			
		}
		// try, finally
		try {
			// 1
			//2 I caught Arithmetic 
			//3 
		}
		finally {
			
		}
		// 3. try, catch, finally
		try {
			
		}
		catch(InputMismatchException e) {
			
		}
		finally {
			
		}
	// 1. try, multiple catch
		try {
			/*
			 * line 1 : InputMismatchException code
			 * Line 2: No exception
			 * Line 3: NumberFormatException code
			 */
			
		}
		catch(InputMismatchException|NumberFormatException e) {
			
		}
		catch(NullPointerException e) {
			
		}
		
		
	}

}
