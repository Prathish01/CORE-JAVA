import java.util.Scanner;
class test1
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("enter number");
int num = scn.nextInt();
int count = 0;
m1(num,count);

}
public static void m1(int num,int count)
{
for( int i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
System.out.println(count);
if(count==2)
{
System.out.println("it is a prime number");
}
else
{
System.out.println("it is not a  prime number");
}
}
}
