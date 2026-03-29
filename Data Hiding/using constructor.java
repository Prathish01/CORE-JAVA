package datahidingusingconstructor;

public class student 
{
private String name;
private int age;

public student(String name,int age)
{
this.name = name;
this.age = age;
}

public String getname()
{
return name;	
}
public int getage()
{
return age;	
}
public void setage(int age)
{
if(age > 0 && age < 120)
{
System.out.println(age);	
}
else
{
System.out.println("invalid age");	
}
}
}

package datahidingusingconstructor;

public class mainclass 
{
public static void main(String [] args)
{
System.out.println("-------------result----------");
student s1 = new student("messi",20);
System.out.println(s1.getname());
System.out.println(s1.getage());
System.out.println(s1.getage());

}
}
