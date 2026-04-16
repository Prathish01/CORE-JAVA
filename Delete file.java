package deletefile;
import java.io.File;
public class delete {
 public static void main(String [] args) {
      File file = new File("E:\\Java\\Notes\\Normalization.pdf");
      boolean isdelete=file.delete();
      if(isdelete)
      {
    	  System.out.println("File deleted successfully");
      }
      else
      {
    	  System.out.println("Try again!!!");
      }
}
}
