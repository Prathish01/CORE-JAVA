package thread;

public class runmethod implements Runnable
{
public void run()
{
for(int i = 1;i<=20;i++)
{
System.out.println(i);	
}
}

public static void main(String [] args)
{
runmethod r1 = new runmethod();
Thread t1 = new Thread(r1);
t1.start();
}
}
