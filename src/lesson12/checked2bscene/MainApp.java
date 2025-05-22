package lesson12.checked2bscene;
/*
The MainApp class manages the overall flow and
 notifies the user if the operation fails completely.
 */
public class MainApp {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        try {
            dataManager.saveData();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Application finished.");
    }
}
