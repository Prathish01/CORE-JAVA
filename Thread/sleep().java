package thread;

public class slepp implements Runnable
{
public void run()
{
for(int i = 1;i<=10;i++)
{
	
try
{
Thread.sleep(2000);	
}
catch(Exception e)
{
e.printStackTrace();	
}
System.out.println(i);
}
}

public static void main(String [] args)
{
	slepp s1 = new slepp();
Thread t1 = new Thread(s1);
t1.start();

}
}
