package thread;

public class slepp extends Thread
{
public void run()
{
for(int i = 1;i<=10;i++)
{
	
try
{
Thread.sleep(1000);	
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
	slepp s2 = new slepp();
	
//Thread t1 = new Thread(s1);
s1.start();
s2.start();

}
}
