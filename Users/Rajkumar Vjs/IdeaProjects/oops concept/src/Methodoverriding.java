import java.util.*;
class Statement1 {
    void statement() {
        System.out.print("he did't complete the project");
    }
}
class Statement2 extends Statement1 {
    void statement() {
        System.out.print("he complete the project");
    }
}

public class Methodoverriding {
    public static void main(String args[]) {
        Statement2 s= new Statement2();
        s.statement();
    }
}
