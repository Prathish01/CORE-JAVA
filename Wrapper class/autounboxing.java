package wrapper;

public class autoboxing 
{
public static void main(String [] args)
{
int a = 10;
Integer num = a;
System.out.println(a);

System.out.println("auto unboxing");

Double num1 = 10.56;
double b = num1;
System.out.println(b);

}
}



when a wrapper object’s value is converted back to a primitive type.
When the compiler does it automatically, it’s called auto-unboxing.
