package BankingApplication;

import java.util.Scanner;

public class BankAccess {
    public int balance;
    public int previousTransation;
    public String customerName;
    public String customerId;

    BankAccess(String cName, String cId) {
        customerName=cName;
        customerId=cId;
    }

    public void deposit(int amount) {
        if(amount !=0) {
            balance = balance+amount;
            previousTransation=amount;
        }

    }
    public void withdraw(int amount) {
        if(amount !=0) {
            balance=balance-amount;
            previousTransation= -amount;
        }
    }
    public void previousTransation () {
        if(previousTransation >0 ) {
            System.out.println("Deposited : " + previousTransation);
        }
        else if(previousTransation < 0) {
            System.out.println("withdarwn" + previousTransation);
        }
        else
        {
            System.out.println("No transation");
        }
    }
    void showMenu () {
        char option='\0';
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome : " + customerName);
        System.out.println("Your id is : " + customerId);
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transation");
        System.out.println("E. Exit");

        do {
            System.out.println("Enter an option");
            option = s.next().charAt(0);

            switch (option) {
                case 'A':
                    System.out.println("Balance : " + balance);
                    break;
                case'B':
                    System.out.println("Enter a deposit amount");
                    int depositAmount = s.nextInt();
                    deposit(depositAmount);
                    break;
                case 'C':
                    System.out.println("Enter a withdraw amount");
                    int withdrawAmount = s.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 'D':
                    previousTransation();
                    break;
                case 'E':
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
        while(option != 'E');{
            System.out.println("Thank you");

        }
    }
}