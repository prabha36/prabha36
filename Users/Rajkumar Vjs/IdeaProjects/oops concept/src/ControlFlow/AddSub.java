package ControlFlow;

import java.util.Scanner;

public class AddSub{
    public static void main(String[] args){
        System.out.println("Enter your 2 values : ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int additionResult = additionMethod(num1,num2);
        System.out.println("Addition Result is : "+additionResult);
        System.out.println("Enter 2 numbers for subtracting");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int subtractionResult = subtractionMethod(num3,num4);
        System.out.println("Subtraction Result is : "+subtractionResult);
    }

    static int additionMethod(int num1, int num2){
        int result = num1+num2;
        return result;
    }

    static int subtractionMethod(int num1, int num2){
        int result = num1-num2;
        return result;
    }
}