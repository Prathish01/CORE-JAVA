package str;
import java.util.Scanner;
public class a 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("enter string name");
String s1 = scn.next();
 char ch = ' ';
print(s1,ch);
}

public static  void print(String s1,char ch)
{
for(int i = s1.length()-1;i>=0;i--)
{
	ch = s1.charAt(i);
	System.out.println(ch);
}
}
}
