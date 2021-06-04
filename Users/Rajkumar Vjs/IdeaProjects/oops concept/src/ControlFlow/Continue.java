package ControlFlow;

import java.util.Scanner;

class Continue {
    public static void main(String[] args) {

        Double number = 0.0;
        Double sum = 0.0;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + " : ");
            number = input.nextDouble();
            if (number <= 0.0) {
                continue;
            }
            sum += number;

        }
        System.out.println("Sum = " + sum);
    }
}
