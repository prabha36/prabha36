package Threads;

public class ImplementRunnable implements Runnable {
    public void run(){
        System.out.println("thread is Running");
    }

    public static void main(String args[]){
        ImplementRunnable I=new ImplementRunnable();
        Thread t =new Thread(I);
        t.start();
    }
}