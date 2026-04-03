package filehandlind;
import java.util.*;
import java.io.File;
import java.io.IOException;
public class filecreation 
{
public static void main(String [] args) throws IOException
{
File handling = new File("E:\\javaclasses\\handling\\hello.txt");	
//boolean isCreated = handling.mkdirs();
boolean b = handling.createNewFile();
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
