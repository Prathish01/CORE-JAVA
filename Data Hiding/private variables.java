package datahiding5;

public class apple 
{
private int x = 10;
private String y = "messi";
public int getx()
{
	return this.x;
}
public String display()
{
	return this.y;
}
public void setx(int x)
{
this.x = x;
}
public void display(String y)
{
this.y=y;	
}
}


package datahiding5;

public class ball 
{
public static void main(String [] args)
{
System.out.println("result")	;
apple a1 = new apple();
System.out.println("before datahiding");
System.out.println(a1.getx());
System.out.println(a1.display());
System.out.println("after datahiding");
a1.setx(07);
System.out.println(a1.getx());
a1.display("ronaldo");
System.out.println(a1.display());
}
}
