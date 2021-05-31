package Threads;

public class GetName extends Thread
{
    public void run()
    {
        System.out.println("Getname value");
    }
    public static void main(String args[])
    {
        GetName t1=new GetName();
        GetName t2=new GetName();
        System.out.println("Name of t1: "+ t1.getName());
        System.out.println("Name of t2: "+t2.getName());

        t1.start();
        t2.start();
    }
}