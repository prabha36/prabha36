package List;
import java.util.*;

public class DequeEx {
    public static void main(String[] args)
    {
        Deque<String> deque = new LinkedList<String>();
        deque.add("Element 1 (Tail)");
        deque.addFirst("Element 2 (Head)");
        deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)");
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");

        System.out.println(deque + "\n");

        deque.removeFirst();
        deque.removeLast();
        deque.add("Element 7(Tail");
        deque.add("Element 8(Head");
        deque.element();
        System.out.println("Deque after removing " + "first and last: " + deque);
    }
}