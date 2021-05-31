package Threads;
 class Message extends Thread {
     public void run() {
         for (int i = 0; i < 5; i++) {
             System.out.println("Hey dude");
             try {
                 Thread t = new Thread();
                 t.sleep(2000);
             } catch (Exception e) {
                 System.out.println(e);
         }
     }
 }

    /*@Override
     public void run() {
         super.run();
     }*/
 }

      class Message2 extends Thread {
         public void run() {
             for (int i = 0; i <= 5; i++) {
                 System.out.println("Hi Buddie");
                 try {
                     Thread t = new Thread();
                     t.sleep(2000);
                 } catch (Exception e) {
                     System.out.println(" ");
                 }
             }
         }
     }




public class Sleep {
    public static void main(String args[]) {
        Message m = new Message();
        Message2 m2=new Message2();
        m.start();
      try
        {
            Thread t= new Thread();
            t.sleep(10);
        }
        catch (Exception e) {
            System.out.println(" ");
        }
      m2.start();
    }
}
