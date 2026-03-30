class employee
{
int id;
String name;
String designation;
String cname;


public employee (int id,String name,String designation,String cname)
{
this.id =id;
this.name=name;
this.designation=designation;
this.cname=cname;

}
public int eheigth()
{
return 123;
}
public double eweigth()
{
return 12.3;
}
public int ccode()
{
return 12345;
}
}

public class mainemployee
{
public static void main(String [] args)
{
employee e1 = new employee(123,"muri","developer","zoho");
System.out.println("id \t\t\t  name \t\t\t desination \t\t\t cname");
System.out.println(e1.id + "\t\t\t" + e1.name + "\t\t\t" + e1.designation +"\t\t\t" + e1.cname); 



System.out.println(e1.eheigth());
System.out.println(e1.eweigth());
System.out.println(e1.ccode());
}
}
