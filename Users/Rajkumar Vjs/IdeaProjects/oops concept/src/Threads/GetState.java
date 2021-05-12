package Threads;

public class GetState implements Runnable
{
    public void run()
    {
        Thread.State state = Thread.currentThread().getState();
        System.out.println(Thread.currentThread().getName());
        System.out.println(state);
    }
    public static void main(String args[])
    {
        GetState g = new GetState();
        Thread t1= new Thread(g);
        Thread.State state = Thread.currentThread().getState();
        System.out.println(state);
        t1.start();
    }
}
