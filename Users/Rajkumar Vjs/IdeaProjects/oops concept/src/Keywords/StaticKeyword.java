package Keywords;

public class StaticKeyword {
    static int a=0;
     StaticKeyword() {
        a+=1;
        System.out.println(a);
    }
    static void display() {
        System.out.println("...Using static...");
    }

    static
    {
        System.out.println("...This is Static block...");
    }

    public static void main(String args[]) {

        StaticKeyword sk= new StaticKeyword();
        StaticKeyword sk1=new StaticKeyword();
        StaticKeyword sk2=new StaticKeyword();
        display();
    }
}