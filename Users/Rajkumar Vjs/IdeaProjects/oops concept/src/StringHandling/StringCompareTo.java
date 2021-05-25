package StringHandling;

import java.util.Scanner;

public class StringCompareTo {
    public void ComparingTwoValue(String fn, String ln) {
        int a=fn.compareTo(ln);
        System.out.println("To compare the two names : "+ a);
        a=ln.compareTo(fn);
        System.out.println(a);
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName=sc.next();
        System.out.println("Enter your last name : ");
        String lastName=sc.next();

        StringCompareTo scompare=new StringCompareTo();
        scompare.ComparingTwoValue(firstName,lastName);
    }
}
