package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class BikeDetailsHashMap {
    public HashMap<String,String> bikeDetails() {
        HashMap<String,String> bDetail=new HashMap<>();
        bDetail.put("R15 Verstion3" , "1,85,000");
        bDetail.put("NS 200", "1,35,000");
        bDetail.put("Ninja 600", "6,00,000");
        return bDetail;
    }

    public static void main(String args[]) {
        System.out.println("Welcome to Our Showroom");
        System.out.println("Bike Details");
        System.out.println("1.R15 Verstion3");
        System.out.println("2.NS 200");
        System.out.println("3.Ninja 600");
        System.out.println("4.Exit");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Choose your favorite bike and get the cost");
        Scanner scan= new Scanner(System.in);
        int userInput = scan.nextInt();


        BikeDetailsHashMap _hashmap = new BikeDetailsHashMap();
        HashMap<String,String> returnDetail = _hashmap.bikeDetails();
        if(userInput == 1) {
            if (returnDetail.containsKey("R15 Verstion3")) {
                System.out.println("Your bike cost : " + returnDetail.get("R15 Verstion3"));
            }
        }else if(userInput == 2) {
            if(returnDetail.containsKey("NS 200")) {
                System.out.println("Your bike cost :" + returnDetail.get("NS 200"));
            }
        } else if(userInput == 3) {
            if(returnDetail.containsKey("Ninja 600")) {
                System.out.println("Your bike cost : " + returnDetail.get("Ninja 600"));
            }
        } else {
            System.out.println("Thank you");
        }
    }
}
