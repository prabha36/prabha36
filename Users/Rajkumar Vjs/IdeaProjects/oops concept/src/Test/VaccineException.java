package Test;

import java.util.Scanner;

public class VaccineException extends Exception {
    public void isEligibleForVaccine(int age) {
    }
    public static void main(String args[]){
        VaccineException vaccineException = new VaccineException();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        vaccineException.isEligibleForVaccine(age);
        try {
            if (age < 18){
                throw new VaccineException();
            }
        } catch (Exception e) {
            if(age <= 18) {
                System.out.println("Not eligible for Vaccination");
            } else {
                System.out.println("Eligible for Vaccination");
            }
        }
    }
}