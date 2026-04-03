package filehandlind;
import java.io.File;
import java.io.IOException;

public class filecreation {
    public static void main(String[] args) throws IOException {
        File handling = new File("E:\\javaclasses\\handling\\hello.txt");
        handling.createNewFile();
        if (handling.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
