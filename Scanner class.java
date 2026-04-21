import java.util.Scanner;
class program14
{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println ("ENTER salary");
		double salary = scn.nextDouble();
		System.out.println("Before salary="+salary);
		if(salary>=10000)
		{
			salary=salary+salary*0.3;
		}
		else
		{
			salary=salary+salary*0.2;
		}
		System.out.println("After salary;"+salary);
	}
}
