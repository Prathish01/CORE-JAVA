package exception1;

public class nullpointerexception 
{
public static void main(String [] args)
{
int[] arr1 = null;
System.out.println(arr1[0]);
}
}


output
Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "arr1" is null
	at exception1.nullpointerexception.main(nullpointerexception.java:8)
