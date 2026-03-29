package laptop;

abstract public class laptop 
{
abstract public void brand();
abstract public void price();
abstract public void ram();
abstract public void storage();

}

package laptop;

public class asus extends laptop
{

	@Override
	public void brand() {
		System.out.println("rog");
		
	}

	@Override
	public void price() {
		System.out.println("2 lakhs");
		
	}

	@Override
	public void ram() {
		System.out.println("32 gb ram");
		
	}

	@Override
	public void storage() {
		System.out.println("1tb storage");
		
	}

}

package laptop;

public class hp extends laptop
{

	@Override
	public void brand() {
		System.out.println("omen");
		
	}

	@Override
	public void price() {
		System.out.println("140000");
		
	}

	@Override
	public void ram() {
		System.out.println("16gb ram");
		
	}

	@Override
	public void storage() {
		System.out.println("512gb storag
                       package laptop;

public class lenovo extends laptop
{

	@Override
	public void brand() {
		System.out.println("loq");
		
	}

	@Override
	public void price() {
		System.out.println("65000");
	}

	@Override
	public void ram() {
		System.out.println("8gb ram");
		
	}

	@Override
	public void storage() {
		System.out.println("512gb storage");
		
	}

}
		
	}

}

package laptop;

public class help 
{
public void process(laptop l)
{
if(l instanceof hp)
{
hp h = (hp)l;
h.brand();
h.price();
h.ram();
h.storage();
}
else if(l instanceof lenovo)
{
lenovo li = (lenovo)	l;
li.brand();
li.price();
li.ram();
li.storage();

}
else
{
	asus a = (asus)	l;
	a.price();
	a.ram();
	a.storage();
}
}
}


package laptop;
import java.util.*;
public class mainmethod 
{
public static void main(String [] args)
{
	Scanner scn = new Scanner(System.in);
	System.out.println("enter choice");
	int choice = scn.nextInt();
help h1 = new help();
switch(choice)
{
case 1 : h1.process(new hp());
break;
case 2 : h1.process( new lenovo());
break;
case 3 : h1.process(new asus());


}

}
}
