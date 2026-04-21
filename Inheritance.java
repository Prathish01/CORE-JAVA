class a
{
int a =100;
void print()
{
System.out.println("hi print");
}
}

class b extends a
{
char b = 'B';
void print2()
{
System.out.println("hi print2");
}
}
class c extends a
{
double c =69.9;
void print3()
{
System.out.println("hi print3");
}
}
class d extends a
{
boolean d =true;
void print4()
{
System.out.println("hi print4");
}
}
class e extends c
{
String e ="multiple inheritance";
void print5()
{
System.out.println("hi print5");
}
}

class inheritance12
{
	
	public static void main(String [] args)
	{
		a a1 = new a();
		System.out.println(a1.a);
		a1.print();
		
		
		b b1 = new b();
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.print();
		b1.print2();
		
		
		c c1 = new c();
		System.out.println(c1.a);
		System.out.println(c1.c);
		c1.print();
		c1.print3();
		
		d d1 = new d();
		System.out.println(d1.a);
		System.out.println(d1.d);
		d1.print();
		d1.print4();
		
		e e1 = new e();
		System.out.println(e1.a);
		System.out.println(e1.c);
		System.out.println(e1.e);
		e1.print();
		e1.print3();
		e1.print5();
	}
}
