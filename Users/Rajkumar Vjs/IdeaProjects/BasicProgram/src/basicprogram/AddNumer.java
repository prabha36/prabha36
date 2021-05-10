package basicprogram;
import java.util.*;

public class AddNumer {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        int a=s.nextInt();
        int b=s.nextInt();
        int c;
        c=a+b;
        System.out.println("a+b=" + c);
    }
}