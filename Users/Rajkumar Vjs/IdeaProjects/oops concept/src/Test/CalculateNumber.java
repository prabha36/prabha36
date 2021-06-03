package Test;

import java.util.Scanner;

public class CalculateNumber extends Exception {
    public double calculate(double a, double b, String operator) {
        double answer = 0;
        try {
            if (operator.equals("+")) {
                answer = a + b;
            } else if (operator.equals("-")) {
                answer = a - b;
            } else if (operator.equals("*")) {
                answer = a * b;
            } else if (operator.equals("/")) {
                answer = a / b;
            } else {
                answer = 0;
            }
            return answer;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("The Exception is occurs : "+ e);
        }

        return answer;
    }
    public static void main(String args[]) {
        CalculateNumber calculateNumber=new CalculateNumber();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer number");
        double firstNumber=scan.nextDouble();
        System.out.println("Enter the second integer number");
        double secondNumber=scan.nextDouble();
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter the operator     Ex: +, _, *, /");
        String operator=scan1.nextLine();

        calculateNumber.calculate(firstNumber,secondNumber,operator);
        double result =calculateNumber.calculate(firstNumber,secondNumber,operator);
        System.out.println("The result is " + result);

    }
}