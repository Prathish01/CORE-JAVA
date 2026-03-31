package casting;
import java.io.IOException;
public class mainsd 
{
public static void main(String [] args)
{
try
{
throw new IOException("input/output exception");	
}
catch(IOException e)
{
System.out.println(e.toString());	
}
System.out.println("start");
System.out.println("end");
}
}
