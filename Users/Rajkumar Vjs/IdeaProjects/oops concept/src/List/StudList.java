package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudList {
    public static void main(String args[]) {
        List<String> totalStud = new ArrayList<String>();
        totalStud.add("Prabha");
        totalStud.add("Rajkumar");
        totalStud.add("Karthik");
        totalStud.add("Bharath");
        totalStud.add("Ajith");
        totalStud.add("Mani");
        System.out.println("Total students"+totalStud);
        totalStud.remove(3);
        System.out.println("Remove Bharath"+totalStud);
        totalStud.remove(4);
        System.out.println("Remove Mani"+totalStud);
        totalStud.removeAll(totalStud);
        System.out.println("Remove All"+totalStud);
        List<String> stud2= new ArrayList<String>();
        stud2.addAll(totalStud);
        if(stud2.equals(totalStud)) {
            System.out.println("Both are equal");
        }
    }
}
