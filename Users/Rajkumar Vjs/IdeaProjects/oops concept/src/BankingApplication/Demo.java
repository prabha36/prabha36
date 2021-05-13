package BankingApplication;

import java.util.Scanner;

public class Demo {
    void bigNumber() {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your numbers : ");
        int a;
        int b;
        a =s.nextInt();
        b =s.nextInt();
        if(a > b ) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
    public static void main(String args[]) {
        Demo d= new Demo();
        d.bigNumber();
    }
}
