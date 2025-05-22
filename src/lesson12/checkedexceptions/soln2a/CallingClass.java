package lesson12.checkedexceptions.soln2a;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

/** Case 2a: use try/catch and handle the exception */
public class CallingClass {
	private static final Logger LOG 
	  = Logger.getLogger(
		   CallingClass.class.getPackage().toString());
	void writeInfo() {
		try {
			// Code gives exeption must me inside try block
			FileWriter fw = new FileWriter("MyFile");
			// The remainig code of try block will not execute
			System.out.println("End of Try");
		}
		catch(IOException e) {
			LOG.warning("Unable to open file 'MyFile'");
		//	System.out.println(e.getMessage());
			System.out.println("Error opening file...exiting application");
			System.exit(0);
		}

	}
}
