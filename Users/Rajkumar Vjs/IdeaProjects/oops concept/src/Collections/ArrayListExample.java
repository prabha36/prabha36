package Collections;
import java.util.*;
public class ArrayListExample {
    public static void main(String args[]) {
        int a=10;
        ArrayList arrayList = new ArrayList();
        for(int i=0;i<=a;i++) {
            arrayList.add(a);
            System.out.println(arrayList);
        }

        arrayList.remove(2);
        arrayList.add(4);
        System.out.println(arrayList);
    }
}