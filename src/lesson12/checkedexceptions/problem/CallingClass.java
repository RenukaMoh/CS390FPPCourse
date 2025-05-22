package lesson12.checkedexceptions.problem;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

	public class CallingClass {
		void writeInfo() {
            try {
                FileWriter fw = new FileWriter("MyFile");  //compiler error
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
	}


