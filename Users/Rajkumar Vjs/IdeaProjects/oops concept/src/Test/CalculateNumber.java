package Test;

import java.util.Scanner;

public class CalculateNumber {
    public int calculate(int a, int b, String operator) {
        int answer;
        if(operator.equals("+")) {
            answer = a + b;
        } else if(operator.equals("-")) {
            answer = a - b;
        } else if(operator.equals("*")) {
            answer = a * b;
        } else if(operator.equals("/")) {
            answer = a / b;
        } else {
            answer = 0;
        }
        return answer;
    }
    public static void main(String args[]) {
        CalculateNumber calculateNumber=new CalculateNumber();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer number");
        int firstNumber=scan.nextInt();
        System.out.println("Enter the second integer number");
        int secondNumber=scan.nextInt();
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter the operator     Ex: +, _, *, /");
        String operator=scan1.nextLine();

        calculateNumber.calculate(firstNumber,secondNumber,operator);
        int result =calculateNumber.calculate(firstNumber,secondNumber,operator);
        System.out.println("The result is " + result);

    }
}