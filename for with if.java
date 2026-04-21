import java.util.Scanner;
class example
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("enter name");
String s1=scn.next();
char ch = ' ';

for(int i =0;i<=s1.length()-1;i++)
{
ch = s1.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
{
	System.out.println(ch);
	
}
}

}


}
