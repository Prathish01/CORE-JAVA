package compilepoly;

public class phoneunlock 
{
public void unlock()
{
System.out.println("phone unlocked by swiping");
}
public void unlock(int pin)
{
System.out.println("phone unlocked by using pin");	
}
public void unlock(String password)
{
	System.out.println("phone unlocked by using password");
}
}


package compilepoly;
import java.util.Scanner;
public class mainclass 
{
public static void main(String [] args)
{
	Scanner scn = new Scanner(System.in);
	phoneunlock p1 = new phoneunlock();
	
	System.out.println("enter choice");
	int choice = scn.nextInt();
	switch(choice)
	{
	case 1 : p1.unlock();
	break;
	case 2 :
		
		System.out.println("enter pin");
	    int pin = scn.nextInt();
	   
	    break;
	case 3 : 
		System.out.println("enter password");
		String pass = scn.next();
		 p1.unlock(pass);
		break;
		
	    
	default : System.out.println("invalid choice");
	break;
	}
	
}
}
