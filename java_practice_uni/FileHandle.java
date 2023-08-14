import java.io.File;
import java.io.FileWriter;

public class FileHandle {
    public static void main(String[] args) {

        // File obj = new File("notes.txt");
        // if (obj.exists()) {
        // System.out.println("File already exist");
        // } else {
        // System.out.print("File does not exist");
        // }

        try {
            FileWriter wrte = new FileWriter("notes.txt");
            wrte.write("Files in java might be tricky, but it is fun enough", 0, 0);
            wrte.close();
        } catch (Exception e) {
            System.out.print("An error occured");
        }

    }
}
