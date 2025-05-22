package lesson12.exceptionsdemo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Hierarchy {
    public static void main(String[] args) {
        try {
            //throw new Below18AgeException("You are too young!");
            FileWriter fw = new FileWriter("MyFile");
        }
        // Go from specific to general
        catch (FileNotFoundException e){

        }
        catch (IOException o){

        }



    }
}
