import java.util.*;
class Check {
    void Zero() {
        try{
            int a=20/0;
            System.out.println(a);
        }
        catch (ArithmeticException f){
            System.out.println("ArithmeticException" + f.getMessage());
        }
        finally {
            System.out.println("Always executed");
        }

        System.out.println("After try");
    }
}
public class Exception extends Throwable {
    public static void main(String args[]) {
        Check c= new Check();
        c.Zero();
    }
}