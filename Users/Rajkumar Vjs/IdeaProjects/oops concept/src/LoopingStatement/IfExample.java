package LoopingStatement;

import java.util.Scanner;

public class IfExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int sum1 =sum;
        for (int i = 1; i <=sum; i++) {
            System.out.println(i);
           if (i==sum1) {
                System.out.println("Condition satisfied");
            }
           else
           {
               System.out.println("Try again");
           }
        }
    }
}
