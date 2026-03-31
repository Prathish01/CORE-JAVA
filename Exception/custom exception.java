package dinner;
import java.util.Scanner;
public class main 
{
public static void main(String [] args)
{
String din = "chapati";
Scanner scn = new Scanner(System.in);
System.out.println("enter dinner");
String dinner = scn.next();
if(dinner.equals(din))
{
	System.out.println("Dinner = " + dinner);
throw new YummyDinnerException("chapati");

}
else
{
	System.out.println("dinner" +dinner);
throw new ShitDinnerException("parotta");

}

}
}

package dinner;

public class ShitDinnerException extends  RuntimeException
{
public ShitDinnerException(String message)
{
super(message);	
}
}

package dinner;

public class YummyDinnerException extends RuntimeException
{
public YummyDinnerException(String message)
{
super(message);	
}
}
