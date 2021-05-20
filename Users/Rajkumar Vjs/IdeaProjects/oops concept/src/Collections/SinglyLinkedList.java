package Collections;

import java.util.LinkedList;

public class SinglyLinkedList {
    public static void main(String args[]) {
        LinkedList<String> Bikes=new LinkedList<>();
        Bikes.add("R15 v3");
        Bikes.add("NS 200");
        Bikes.addFirst("Ninja 600");
        Bikes.addLast("RS");
        Bikes.add(2,"R15 v2");

        System.out.println("In Main show room" + Bikes);
        Bikes.removeLast();
        Bikes.remove(3);
        System.out.println("Available in the branch"+Bikes);

        String access=Bikes.get(2);
        System.out.println("Access the bike"+access);

        Bikes.set(0, "BMW");
        System.out.println(""+Bikes);
    }
}
