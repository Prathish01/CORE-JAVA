package filehandlind;

import java.io.*;
public class insertingdata 
{
public static void main(String [] args) throws IOException
{
File handling = new File("E:\\javaclasses\\handling\\hello.txt");
FileWriter fw = new FileWriter(handling);
fw.write("java is good");
System.out.println();
fw.write("hello world");
fw.write("get a job");
fw.flush();

}
}
