
package cast;

public class a 
{
public void ab()
{
System.out.println("hi ab");	
}

}

package cast;

public class b extends a
{
public void ba()
{
System.out.println("hi ba");	
}
}

package cast;

public class mainmethod 
{
public static void main(String []  args)
{
System.out.println("result");	
a a1 = new a();
try
{
b b1 = (b) a1;

}
catch(Exception e)
{
System.out.println(e);	
}
}
}
