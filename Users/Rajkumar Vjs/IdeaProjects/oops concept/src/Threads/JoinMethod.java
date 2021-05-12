package Threads;

public class JoinMethod extends Thread {
     public void run() {
         for (int i=0;i<5;i++) {
             System.out.println("person one " + i);
             try {
                 Thread t=new Thread();
                 t.sleep(500);
             }
             catch (Exception e) {
                 System.out.println(" ");
             }
         }
     }
     public static void main(String args[]) {
         JoinMethod j= new JoinMethod();
         JoinMethod j1= new JoinMethod();
         JoinMethod j2= new JoinMethod();
         j.start();
         try {
             j.join(1500);
         }
         catch (Exception e) {

         }

         j1.start();
         j2.start();
     }

}
