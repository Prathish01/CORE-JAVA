package vehicle;

abstract public class vehicle 
{
 String brand;
 int no;
 int topspeed;

public  vehicle(String brand,int no,int topspeed)
{
	this.brand = brand;
	this.no = no;
	this.topspeed = topspeed;
	}
}

package vehicle;

public class bike extends  vehicle 
{
	public bike(String brand,int no,int topspeed)
	{
super(brand,no,topspeed);
}
public void stand()
	{
		System.out.println("stand id up");
	}
}
}

package vehicle;

	public class car extends vehicle
	{
		public car(String brand,int no,int topspeed)
		{
	super(brand,no,topspeed);
	}
	}

package vehicle;

public class help
{
public void process(vehicle v)
{
	if(v instanceof bike)
	{
		bike b = (bike)v;
System.out.println(b.brand + "\twith a number of" + b.no + "top speed" + b.topspeed);
		
	}
	else
	{
		car c = (car)v;
		System.out.println(c.brand + "\twith a number of" + c.no + "top speed" + c.topspeed);
	}
}
}

package vehicle;

public class mainmethod 
{
public static void main(String [] args)
{
System.out.println("------result---------");	
help h = new help();
h.process(new bike("r15",146492,144));
h.process(new car("rapid",146492,230));
}
}
