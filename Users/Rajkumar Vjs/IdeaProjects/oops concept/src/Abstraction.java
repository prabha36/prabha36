import java.util.*;
abstract class Basic {
    public abstract void personalDetails();

     void basicDetails() {
        int salary=10000;
        System.out.println("The salary details" + salary);
    }
}

class Personal extends Basic {
    public void personalDetails() {
        int bal=200000;
        System.out.print("Your bank bal" + bal);
    }
}

public class Abstraction {
    public static void main(String args[]) {
        Personal ob = new Personal();
        ob.personalDetails();
        ob.basicDetails();
    }
}