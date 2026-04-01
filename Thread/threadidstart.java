package thread;

public class threadid implements Runnable
{
public void run()
{
System.out.println("id of the usd :" +Thread.currentThread().getId());	
}


public static void main(String [] args)
{
System.out.println(Thread.currentThread().getId());	
threadid ti = new threadid();
Thread t1 = new Thread(ti);
t1.start();
}
}
