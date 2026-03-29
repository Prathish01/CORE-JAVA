package fh;
import java.io.*;
public class fle 
{
public static void main(String [] args) throws IOException
{
File messi = new File("C:\\Users\\mural\\OneDrive\\Desktop\\xx\\we\\dingi\\messi.mp4");
boolean b = messi.createNewFile();
if(b)
{
System.out.println("file is created");	
}
else
{
System.out.println("file is not created");	
}
}
}
