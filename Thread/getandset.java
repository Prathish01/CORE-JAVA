package thread;

public class getandset1 implements Runnable
{
    public void run()
    {
        System.out.println("Priority before change (child thread): " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(4);
        System.out.println("Priority after change (child thread): " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args)
    {
        System.out.println("Default main thread priority: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        System.out.println("Updated main thread priority: " + Thread.currentThread().getPriority());

        getandset1 ti = new getandset1();
        Thread t1 = new Thread(ti);
        t1.start();
    }
}
