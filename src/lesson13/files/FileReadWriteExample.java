package lesson13.files;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String file = "output.txt"; // File name
        String content = "This is the new content being added.\n"; // Content to write

        writeToFile(file, content); // Step 1: Write to file
        readFromFile(file);         // Step 2: Read & display file contents
    }

    /** Writes to file, appends if it exists, otherwise creates a new file */
    public static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            System.out.println("Content written to " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /** Reads the file and prints content to the console */
    public static void readFromFile(String filePath) {
        System.out.println("\nReading from " + filePath + "...");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
