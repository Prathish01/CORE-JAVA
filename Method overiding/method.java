package methodoverriding;
class human {
	public void eat()
	  {
		System.out.println("Human eats a chocolate");
	  }
}	
class boy extends human{
public void eat()
{
System.out.println("Boy eats chocolate");
}


}
package methodoverriding;

public class mainclass {
	public static void main(String []args)
	  {
		boy obj=new boy();
		obj.eat();
	   }	
	}
