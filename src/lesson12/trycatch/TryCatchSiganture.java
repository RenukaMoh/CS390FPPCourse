package lesson12.trycatch;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class TryCatchSiganture {

	public static void main(String[] args)  {
		try {
			// Exception code block
			FileWriter fw = new FileWriter("MyFile"); 
		}
		// Specific
		catch(FileNotFoundException io) {

		}
		//General
		catch (IOException exp){
			// How you are going handle
		}


		
		/*finally {
			
		}*/
	}

}
