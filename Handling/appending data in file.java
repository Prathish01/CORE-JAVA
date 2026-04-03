package filehandlind;
import java.io.*;
public class append_keyword_in_jacva 
{
public static void main(String [] args) throws IOException
{
	File handling = new File("E:\\javaclasses\\handling\\hello.txt");
	FileWriter fa = new FileWriter(handling);
	fa.append("hi ");
	fa.flush();
}
}
