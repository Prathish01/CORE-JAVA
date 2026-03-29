package smartphone;

public interface smartphone 
{
public void model();
public void price();
public void batterylife();
}


package smartphone;

public class samsung implements smartphone
{
public void model()
{
	System.out.println("model is samsung s23");
}
public void price()
{
	System.out.println("400 dollars");
}
public void batterylife()
{
	System.out.println("20 hours");
}
}


package smartphone;

public class iphone implements smartphone
{
	public void model()
	{
		System.out.println("model is iphone 16 pro");
	}
	public void price()
	{
		System.out.println("700 dollars");
	}
	public void batterylife()
	{
		System.out.println("15 hours");
	}
	}


package smartphone;

public class oneplus implements smartphone
{
	public void model()
	{
		System.out.println("model is oneplus 11r");
	}
	public void price()
	{
		System.out.println("350 dollars");
	}
	public void batterylife()
	{
		System.out.println("18 hours");
	}
	}

package smartphone;

public class mi implements smartphone
{
	public void model()
	{
		System.out.println("model is redminote 4");
	}
	public void price()
	{
		System.out.println("150 dollars");
	}
	public void batterylife()
	{
		System.out.println("12 hours");
	}
	}


package smartphone;

public class help 
{
public void get(smartphone s)
{
if(s instanceof samsung)
{
	samsung s1 =(samsung)s;
	s1.model();
	s1.price();
	s1.batterylife();
}
else if(s instanceof iphone)
{
	iphone i =(iphone)s;
	i.model();
	i.price();
	i.batterylife();
}
else if(s instanceof oneplus)
{
	oneplus op =(oneplus)s;
	op.model();
	op.price();
	op.batterylife();
}
else
{
	mi m =(mi)s;
	m.model();
	m.price();
	m.batterylife();
}
}
}


package smartphone;
import java.util.Scanner;
public class mainmethod 
{
	public static void main(String [] args)
	{
Scanner scn = new Scanner(System.in);
help h1 = new help();
System.out.println("enter choice");
int choice = scn.nextInt();
switch(choice)
{
case 1 : h1.get(new samsung());
break;
case 2 : h1.get(new iphone());
break;
case 3 : h1.get(new oneplus());
break;
case 4 : h1.get(new mi());
break;
default : System.out.println("invlalid choice");
break;
}
}
}
