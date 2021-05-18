package Keywords;

public class InstanceofKeyword {

    public static void main(String[] args) {

        String name = "Programiz";
        boolean result1 = name instanceof String;

        System.out.println("name is an instance of String: " + result1);
        InstanceofKeyword obj = new InstanceofKeyword();

        boolean result2 = obj instanceof InstanceofKeyword;
        System.out.println("obj is an instance of Main: " + result2);
    }
}
