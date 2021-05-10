class Animal1 {
    Animal1() {
        System.out.println("Animal one is Cat");
    }
}
class Animal2  {
    Animal2() {
        super();
        System.out.println("Animal two is dog ");
    }
}

public class SuperConstructor {
    public static void main(String args[]) {
        Animal2 a= new Animal2();
    }
}
