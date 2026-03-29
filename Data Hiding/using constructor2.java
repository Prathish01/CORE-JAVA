package employee;

public class employees {
private int empid;
private String name;
private double salary;
public employees(int empid,String name,double salary)
{
this.empid =empid;
this.name = name;
this.salary = salary;
}
public int getempid() 
{
	return empid;
}
public String getname() 
{
	return name;
}
public double getsalary() 
{
	return salary;
}
public void setsalary(double salary)
{
System.out.println(salary);	
}


}

package employee;

public class mainmethod 
{
public static void main(String [] args)
{
System.out.println("---------result-----------");
employees e1 = new employees(7890,"messi",23.500);
System.out.println(e1.getempid());
System.out.println(e1.getname());
System.out.println(e1.getsalary());
e1.setsalary(e1.getsalary() + 23.4);
}
}
