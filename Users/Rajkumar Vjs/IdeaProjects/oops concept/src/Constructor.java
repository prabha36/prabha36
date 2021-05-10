import java.util.*;
class ExampleConstructor {
    String name;
    ExampleConstructor() {
       this.name="prabha";
    }
}
public class Constructor {
    public static void main(String args[]) {
        ExampleConstructor e=new ExampleConstructor();
        System.out.println("Your name is : " + e.name);
    }
}