package thread;

public class racecondition extends Thread
{
	static synchronized void increment()
	{
		count++;
		
	}
static int count = 0;
public void run()
{
for(int i =1;i<=1000;i++)
{
	racecondition.increment();
}

}

public static void main(String [] args) throws InterruptedException
{
	racecondition r1 = new racecondition();
	racecondition r2 = new racecondition();
	r1.start();
	r2.start();
	r1.join();
	r2.join();
	System.out.println(count);
}
}
