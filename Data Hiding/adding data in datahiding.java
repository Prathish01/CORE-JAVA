package datahidingmarks;

public class students 

{
private String name;
private int marks;
public students(String name,int marks)
{
this.name = name;
this.marks = marks;
}
public String getx()
{
return this.name;	
}
public int getx1()
{
return this.marks;	
}
public void setx(String name)
{
	this.name =name;
}
public void setx1(int marks)
{
   this.marks = marks;	
}
}


package datahidingmarks;

public class mainmethod 
{
public static void main(String [] args)
{
System.out.println("---------------output------------------");	
students s1 = new students("murali",70);
students s2 = new students("hazard",90);
students s3 = new students("ronaldo",2090);

System.out.println("before data hiding");
System.out.println(s1.getx());
System.out.println(s1.getx1());
System.out.println(s2.getx());
System.out.println(s2.getx1());
System.out.println(s3.getx());
System.out.println(s3.getx1());


s1.setx1(s1.getx1() + 10);
s2.setx1(s2.getx1() + 10);
s3.setx1(s3.getx1() + 10);
System.out.println("afters data hiding");
System.out.println(s1.getx());
System.out.println(s1.getx1());
System.out.println(s2.getx());
System.out.println(s2.getx1());
System.out.println(s3.getx());
System.out.println(s3.getx1());


}
}
