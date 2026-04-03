package filehandlind;
import java.io.*;
import java.util.Scanner;
public class hashnex 
{
public static void main (String [] args) throws FileNotFoundException
{
	
	File handling = new File("E:\\javaclasses\\handling\\hello.txt");
	Scanner scn = new Scanner(handling);
	while(scn.hasNext())
	{
		System.out.println(scn.nextLine());
	}
    scn.close();
}
}
