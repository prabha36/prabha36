import java.util.*;
class Check1 {
    void a (){
        int a=20;
        System.out.println(" ");
        throw new ArithmeticException("exception");

    }
}
public class Throwandthrows {
    public static void main(String args[]) {
        Check1 c = new Check1();
        c.a();
    }
}
