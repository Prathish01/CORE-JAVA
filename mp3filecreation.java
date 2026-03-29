package fh;
import java.io.*;
public class fle 
{
public static void main(String [] args) throws IOException
{
File flute = new File("C:\\Users\\mural\\OneDrive\\Desktop\\xx\\we\\dingi\\flute.mp3");
boolean b = flute.createNewFile();
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
