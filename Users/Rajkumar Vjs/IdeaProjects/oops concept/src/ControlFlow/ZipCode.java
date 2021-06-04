package ControlFlow;

import java.util.HashMap;
import java.util.Scanner;

public class ZipCode {
    public static void main(String args[]) {
        /*HashMap<Integer,String> zipCode = new HashMap<Integer, String>();
        zipCode.put(600020,"Adyar");
        zipCode.put(600004, "Mylapore");
        zipCode.put(6000020,"Nungambakkam");*/

        System.out.println("Enter your zipcode : ");
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();

       /*if(zipCode.containsKey(600020)) {

            System.out.println(zipCode.get(600020));
        } else if(zipCode.containsKey(600004)){
            System.out.println(zipCode.get(600004));
        }*/

       /* if(input == 600020) {
            System.out.println("Adyar");
        }
        else if(input == 600004) {
            System.out.println("Mylapore");
        }
        else if (input == 6000020) {
            System.out.println("Nungambakkam");
        }
        else {
            System.out.println("Invalid");
        }*/
        switch (input) {
            case 600020:
                System.out.println("Adyar");
                break;
            case 600004:
                System.out.println("Mylapore");
                break;
            case 6000020:
                System.out.println("Nungambakkam");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}