package exception1;
import java.util.Scanner;
public class inputmismatchexception 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("enter num");
try {
int num = scn.nextInt();
}
catch(Exception e)
{
System.out.println(e);	
}
}
}

output

enter num
er
java.util.InputMismatchException
