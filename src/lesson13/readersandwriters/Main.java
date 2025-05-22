package lesson13.readersandwriters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
	//	m.inputStreamReader();
	//	m.outputStreamWriter();
		m.printWriter();
		m.fileReader();
	}
	public void inputStreamReader() {
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(is);
			System.out.print("Type something: ");
			System.out.println("InputStreamReader:  " + reader.readLine());
			is.close();
			reader.close();
			System.out.println();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void fileReader() {
		Scanner sc = null;
		// uses a FileReader
		try {
			FileReader reader = new FileReader("text4.txt");
			BufferedReader bufreader = new BufferedReader(reader);
			String line = null;
			System.out.println("FileReader:");
			while ((line = bufreader.readLine()) != null) {
				System.out.println("  " + line);
			}
			reader.close();
			bufreader.close();
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// uses a Scanner
		try {
			//Scanner sc = new Scanner(new File("text4.txt"));
			// Returns a Path by converting a path string
			 sc = new Scanner(Path.of("text4.txt"));
			String line = null;
			System.out.println("Scanner:");
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				System.out.println("  " + line);
			}

			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(sc != null)
			sc.close();
		}
	}
	public void outputStreamWriter() {
		Writer os = new OutputStreamWriter(System.out);
		PrintWriter writer = new PrintWriter(os);
		writer.println("OutputStreamWriter:\n" + 
		    "  Output to console with chinese: 你");
		writer.close();
		System.out.println();
	}
	//IOException is a Checked Exception
	public void printWriter() {
		try {
			PrintWriter writer = 
					new PrintWriter("text4.txt");	
			writer.printf("PrintWriter:\n" + "  Output this character %c to %s", 
					'你', "file");
			writer.printf("PrintWriter:\n" + "  Output this character %c to %s",
					'$', "file");
			writer.printf("PrintWriter:\n" + "  Output this character %c to %s",
					'@', "file");
			writer.printf("PrintWriter:\n" + "  Output this character %c to %s",
					'!', "file");
			writer.close();		
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
