package specialization;

public class cat implements animal
{

	@Override
	public void eat() {
		System.out.println("dosai");
		
	}

}

package specialization;

public class dog implements animal
{

	@Override
	public void eat() {
		System.out.println("idly");
	}

}

package specialization;

public class rat implements animal
{

	@Override
	public void eat() {
		System.out.println("cheese");		
	}

}

package specialization;

public class Mainclass 
{
  public static void main(String [] args )
  {
	  dog d1=new dog();
	  d1.eat();
	  
	  cat c1=new cat();
	  c1.eat();
	  
	  rat r1=new rat();
	  r1.eat();
	  
  }
}
