package lesson12.checked2bscene;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
// Handles File Writing and Logs Errors
public class FileService {
    private static final Logger LOG = Logger.getLogger(FileService.class.getName());
    public void writeInfo() throws IOException {
        try {
            FileWriter fw = new FileWriter("MyFile");
            fw.write("Sample data");
            fw.close();
        } catch (IOException e) {
            LOG.warning("Unable to open file 'MyFile'");
            System.out.println("Error opening file");
            throw e; // Re-throw the exception to allow higher-level handling
        }
    }
}
