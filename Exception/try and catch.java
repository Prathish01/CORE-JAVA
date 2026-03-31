package exception1;

public class tryblock 
{
public static void main(String [] args)
{
String name = "murali";
try {
System.out.println(name.charAt(6));
}
catch(Exception e)
{
System.out.println(e);	
}

}
}
