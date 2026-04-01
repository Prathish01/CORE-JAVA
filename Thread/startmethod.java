package thread;

public class startmethod extends Thread
{
public void start()
{
System.out.println("the program is started");
System.out.println(Thread.currentThread().getName());
}
}


package thread;
import java.lang.Thread;
public class main 
{
public static void main(String [] args)
{
	System.out.println("creating object");
	startmethod  s1 = new startmethod();
	
	s1.start();
}
}
