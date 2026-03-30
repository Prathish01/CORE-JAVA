import java.util.Scanner;
class a
{
	
public a(int x )
{

System.out.println("pincode = " +x);
System.out.println("hi m1");
}
public a(int x,String y)
{
System.out.println("pincode = " +x);
System.out.println("name = " +y);
System.out.println("hi m2");
}
public a(int x,String y,double z)
{
System.out.println("pincode = " +x);
System.out.println("name = " +y);
System.out.println("paise =" +z);
System.out.println("hi m3");
}
}

class overloading
{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter name");
		int x = scn.nextInt();
		System.out.println("enter pincode");
		String y = scn.next();
		System.out.println("enter paise");
		double z = scn.nextDouble();
		
	System.out.println("------------result-----------------");
	a a1 = new a(name);
	a a2 = new a(name,pincode);
	a a3 = new a(name,pincode,paise);
	}
		
}
