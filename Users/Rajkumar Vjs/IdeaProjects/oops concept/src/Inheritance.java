import java.util.*;

public class Inheritance {
    public static void main(String args[]) {
        Three t= new Three();
        t.c();
        t.a();
        t.second();
    }
}

class One {
    protected String s = "Hi";
    void a() {
        System.out.print( "1st value accepted");
    }
}

class Two extends One {
    void second() {
        s = "";
        System.out.print("2nd value accepted");
    }
}

class Three extends Two {
    void c() {
        System.out.print("3rd value accepted");
    }
}





