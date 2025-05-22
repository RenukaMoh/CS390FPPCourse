package lesson13.datastream;

import java.io.*;

public class DemoDataStream {
    private final String dataFile = "invoicedata.dat";
    private final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    private final int[] units = {12, 8, 13, 29, 50};
    private final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) {
        DemoDataStream ob = new DemoDataStream();
        ob.writeData();
        ob.readData();
    }

    // Writing data to file
    public void writeData() {
        // try with resources will have automatic closable and finally block
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(dataFile))) {
            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
            out.flush(); // Ensure all data is written to the file
            System.out.println("Data successfully written to file.");
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }
    }

    // reading data
    public void readData() {
        double total = 0.0;
        // try with resources will have automatic closable and finally block
        try (DataInputStream in = new DataInputStream(new FileInputStream(dataFile))) {

            while (true) {
                double price = in.readDouble();
                int unit = in.readInt();
                String desc = in.readUTF();
                System.out.format("You ordered %d units of %s at $%.2f%n", unit, desc, price);
                total += unit * price;
            }

        } catch (EOFException e) {
            // Expected when reaching end of file
            System.out.println("End of file reached. Data reading completed.");
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
        System.out.printf("Total price = $%.2f", total);
    }
}
