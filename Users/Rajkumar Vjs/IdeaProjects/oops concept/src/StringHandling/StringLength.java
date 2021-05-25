package StringHandling;

import java.util.Scanner;

public class StringLength {

    public void concatenateName(String fn, String ln) {
        System.out.println(fn.concat(ln));

    }
    public void length(String fn, String ln){
        System.out.println("First name length : "+fn.length());
        System.out.println("Last name length : "+ln.length());
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=sc.nextLine();
        System.out.println("Enter your last name");
        String lastName=sc.nextLine();

        StringLength sl=new StringLength();
        sl.concatenateName(firstName,lastName);
        sl.length(firstName,lastName);

        StringEqual se=new StringEqual();
        se.checkString(firstName,lastName);
    }
}