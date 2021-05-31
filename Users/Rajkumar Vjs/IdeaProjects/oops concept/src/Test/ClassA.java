package Test;

public class ClassA {
    public void print() {
        System.out.println("I am in class A");
    }
}
 class ClassB extends ClassA {
    public void print() {
        System.out.println("I am in class B");
    }
}
class TestProgram {
    public static void main(String args[]) {
        ClassB classB= new ClassB();
        classB.print();
    }
}
