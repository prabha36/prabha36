package Test;

import javax.print.event.PrintEvent;
import java.util.Scanner;

public class ReverseNumber {
    public void reverse() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        int reverseNumber = 0;
        while(number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reverseNumber);
    }
    public static void main(String args[]) {
        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.reverse();
    }
}

