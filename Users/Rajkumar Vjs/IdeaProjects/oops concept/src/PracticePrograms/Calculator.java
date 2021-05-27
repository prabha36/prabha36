package PracticePrograms;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a=0;
        double b=0;
        double c=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your first value : ");
        a=sc.nextDouble();
        System.out.println("Enter your second value : ");
        b=sc.nextDouble();
        System.out.println("select your operation 1. Addition 2.Subtraction 3.Multiplication 4.Divition 5.Power");
        double operation =sc.nextInt();
        double addition=1;
        double subtraction=2;
        double multilication=3;
        double divition=4;
        double power=5;
        if(operation==addition) {
            c=a+b;
            System.out.println(a+"+"+b+"="+c);
        }
        else if(operation==subtraction){
            c=a-b;
            System.out.println(a+"-"+b+"="+c);
        }
        else if(operation==multilication){
            c=a*b;
            System.out.println(a+"*"+b+"="+c);
        }
        else if(operation==divition){
            c=a/b;
            System.out.println(a+"/"+b+"="+c);
        }
        else if(operation==power){
            System.out.println("which one you want to make power value A or B.... If A then click 1 or If B then click 2");
            double power1=sc.nextDouble();
            double first=1;
            double second=2;
            if(power1==first){
                System.out.println("your first value is power value : "+Math.pow(a,2));
            }
            else if(power1==second){
                System.out.println("Your second value is power value : "+Math.pow(b,2));
            }
        }
    }
}
