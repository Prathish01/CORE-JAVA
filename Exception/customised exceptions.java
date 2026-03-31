package exception1;
import java.util.Scanner;
public class throwkeyword 
{
	public static void main(String [] args)
	{
Scanner scn = new Scanner(System.in);
final int blevel = 20;
System.out.println("enter batterylevel");
int level = scn.nextInt();
if(level<=blevel)
{
System.out.println("battery level" +level);
throw new BatteryLowException("plug in to charge");
}
else
{
System.out.println("BATTERY LEVEL" +level);
throw new BatteryFullException("plug out its already full");
}

}
}

package exception1;

public class BatteryLowException extends RuntimeException
{
	 public BatteryLowException(String message) {
	        super(message);
}
}

package exception1;

public class BatteryFullException extends RuntimeException
{
public BatteryFullException(String message)
{
super(message);
}
}
