package lesson12.checked2bscene;

import java.io.IOException;
// This class attempts to call writeInfo() and
// retries the operation if it fails.
public class DataManager {
    private FileService fileService = new FileService();

    public void saveData() {
        int retryCount = 0;
        boolean success = false;

        while (retryCount < 3 && !success) {
            try {
                fileService.writeInfo();
                success = true;
                System.out.println("File written successfully.");
            } catch (IOException e) {
                retryCount++;
                System.out.println("Retry attempt " + retryCount + " failed.");
            }
        }

        if (!success) {
            System.out.println("Failed to write file after multiple attempts.");
        }
    }
}
