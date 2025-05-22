package lesson12.checkedexceptions.soln1;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Solution 1: Do not attempt to handle directly
 * instead, declare that your method throws this kind of exception too
 */
public class CallingClass {
	// throws keyword only use it on the method level
	void writeInfo() throws IOException {
		FileWriter fw = new FileWriter("MyFile");
	/*	String s = null;
		System.out.println(s.length());*/
	}
}
