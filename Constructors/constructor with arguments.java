class a
{

public a (int x) 
{
	System.out.println("hello x");
	System.out.println(x);
}
}
class b
{

public b (int x,int y,String z ) 
{
	System.out.println("hello xyz");
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
}
}

class mainxyz
{
	public static void main(String [] args)
	{
		a a1 = new a(10);
		b b1 = new b(12,13,"cj");
		
	}
}
