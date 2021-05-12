package Threads;

import java.util.Scanner;

public class MobileCharging extends Thread{
    private int a=20;
    private int charge;
    public void run() {
        System.out.println("Check your charge alert (if percentage is less than 20 you will get a print message)");
        Scanner s = new Scanner(System.in);
        charge = s.nextInt();
        if (charge < a) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Please insert your mobile charge");
                try {
                    Thread t = new Thread();
                    t.sleep(10000);

                } catch (Exception e) {

                }
            }
        } else {
            System.out.println("your charge is above 20%");
        }
    }

    public static void main(String args[]) {
        MobileCharging m = new MobileCharging();
        m.start();
    }
}
