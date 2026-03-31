package exception1;

public class finallykeyword 
{
public static void main(String [] args)
{
System.out.println(1);
System.out.println(2);
try {
System.out.println(3);
System.out.println(4/0);
}
catch(Exception e)
{
System.out.println(5);
System.out.println(6);
System.out.println(7);
}
finally
{
System.out.println("start");
System.out.println("end");
System.out.println("finally block");
}
	
}
}

output
1
2
3
5
6
7
start
end
finally block
