package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreListValue {
    public void displayIngredients(ArrayList<String> list) {
        System.out.println("Your Ingredient List");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }


    public static void main(String args[]) {


        ArrayList<String> ingredientList= new ArrayList<>();

        System.out.println("How many Ingredient to enter??");
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();

        System.out.println("Prepared for Ingredient List");
        for (int i=0;i<count;i++) {
            System.out.println("Please enter your Ingredient List");
            Scanner iscan=new Scanner(System.in);
            String iListInput=iscan.nextLine();
            ingredientList.add(iListInput);
        }

        StoreListValue listValue = new StoreListValue();

        listValue.displayIngredients(ingredientList);


    }
}
