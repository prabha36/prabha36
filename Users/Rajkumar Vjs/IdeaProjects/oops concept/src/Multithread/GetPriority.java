package Multithread;

class GetPriority extends Thread
{
    public void run()
    {
        System.out.println("Thread Running");
    }
    public static void main(String[]args)
    {
        GetPriority p1 = new GetPriority();
        p1.start();
        System.out.println("max thread priority : " + p1.MAX_PRIORITY);
        System.out.println("min thread priority : " + p1.MIN_PRIORITY);
        System.out.println("normal thread priority : " + p1.NORM_PRIORITY);
        Thread.currentThread().setPriority(3);
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
    }
}
