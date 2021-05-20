package UnCheckedException;
import java.util.ArrayList;

class ArrayIndexOutOfBoundExceptionEx {
    public static void main(String args[]) {
        ArrayList<String> myList = new ArrayList<String>();
        try {
            myList.add("Dogs");
            myList.add("Snakes");
            myList.add("Cats");
            System.out.println(myList.get(3));
        } catch (Exception e) {
            System.out.println("the ArrayIndexOutOfBoundsException occurs ..." + e);
        }
    }
}