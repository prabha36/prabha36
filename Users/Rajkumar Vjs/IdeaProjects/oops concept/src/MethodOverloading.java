import java.util.*;
  class Testoverloading {
    void method( ) {
        System.out.println("no paramater");
    }
    void method(int a) {
        System.out.print(a);
    }
    void method(int a, int b) {
        System.out.println(a+b);
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        Testoverloading t= new Testoverloading();
        t.method();
        t.method(4,5);
        t.method(4);
    }
}