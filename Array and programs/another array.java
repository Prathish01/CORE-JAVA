package demo1;
import java.util.Scanner;
public class a 
{
public static void main(String[] args) 
{
	Scanner scn = new Scanner(System.in);
	int[] a1 = {20,30,40,50};
	System.out.println("enter value");
	int value = scn.nextInt();
	for(int i =0;i<=a1.length-1;i++)
	{
		if(a1[i] == value)
		{
			System.out.println(i);
		}
	}
}
}
