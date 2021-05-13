import java.util.*;
  class Testoverloading {
    void method( ) {
        System.out.println("no paramater");
    }
    void method(int a) {
        System.out.println(a);
    }
    void method(double a) {
        System.out.println(a);
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        Testoverloading t= new Testoverloading();
        t.method();
        t.method(4);
        t.method(4);
    }
}