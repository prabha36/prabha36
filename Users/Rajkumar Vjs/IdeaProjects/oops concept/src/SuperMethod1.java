class Person {
    void details(int a) {
        System.out.println("print the Detail one : "+ a);
    }
}

class Person1 extends Person {
    void details() {
        System.out.println("Print the Detail two : ");
    }
    void display() {
        details();
        super.details(3);
    }
}

public class SuperMethod1 {
    public static void main(String args[]) {
        Person1 p= new Person1();
        p.display();
    }
}