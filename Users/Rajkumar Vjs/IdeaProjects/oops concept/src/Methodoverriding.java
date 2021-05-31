import java.util.*;
class Statement1 {
    void statement() {
        System.out.print("Method from parent");
    }
}
class Statement2 extends Statement1 {
    void statement() {
        System.out.print("Method from child");
    }
}

public class Methodoverriding {
    public static void main(String args[]) {
        Statement2 s= new Statement2();
        Statement1 s1= new Statement2();
        //Statement2 s2 = new Statement1();
        s1.statement();
        s.statement();
        //s2.statement();
    }
}