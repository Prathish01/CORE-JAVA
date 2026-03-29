package company;

abstract public class employees 
{
 String name;
 double salary;

public employees(String name,double salary)
{
this.name = name;
this.salary = salary;
}

}

package company;

public class manager extends employees
{
public manager(String name,double salary)
{
super(name,salary);
}
public void work()
{
System.out.println("manager is working");	
}
}
package company;

public class engineer  extends employees
{
	public engineer(String name,double salary)
	{
		super(name,salary);
	}
	public void work()
	{
	System.out.println("engineer is working");	
	}
}

package company;

public class intern extends employees
{
public intern(String name,double salary) 
{
	super(name,salary);
}
public void work()
{
System.out.println("intern is working");	
}
}

package company;

public class help 
{
public void process(employees e)

 {
        if (e instanceof manager) {
            manager m = (manager) e;
            System.out.println(m.name + " is a Manager with salary " + m.salary );
        } else if (e instanceof engineer) {
            engineer n = (engineer) e;
            System.out.println(n.name + " is an Engineer with salary " + n.salary);
        } else if (e instanceof intern) {
            intern i = (intern) e;
            System.out.println(i.name + " is an Intern with salary " + i.salary);
        } else {
            System.out.println("Unknown employee type");
        }
    }
}
package company;

public class mainmethod 
{
public static void main(String [] args)
{
help h = new help();
h.process(new manager("Murali", 50000));
h.process(new engineer("Hazard", 40000));
h.process(new intern("Ravi", 10000));
}
}
