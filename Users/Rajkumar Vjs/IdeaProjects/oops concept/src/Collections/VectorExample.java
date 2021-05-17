package Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String args[]) {
        Vector list=new Vector();
        int a= args.length;
        System.out.println(a);
        for (int i=0;i<a;i++) {
            list.addElement(args[i]);
        }
        for (int i=0;i<a;i++) {
            System.out.println(list.elementAt(i));
        }
        list.insertElementAt("Computer",0);
        for (int i=0;i<a;i++) {
            System.out.println(list.elementAt(i));
        }
        int size=list.size();
        System.out.println(size);
        String[] name=new String[size];
        list.copyInto(name);
        for(int i=0;i<size;i++) {
            System.out.println(list.elementAt(i));
        }

    }


}
