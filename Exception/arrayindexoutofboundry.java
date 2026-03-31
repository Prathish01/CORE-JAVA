package exception1;
import java.util.Scanner;
public class arrayindexoutofboundry 
{
public static void main(String [] args)
{
	Scanner scn = new Scanner(System.in);
int[] arr1 = {10,20,30,40,50};

		System.out.println(arr1[5]);
}
}



output
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at exception1.arrayindexoutofboundry.main(arrayindexoutofboundry.java:10)
