package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmpLinkedList {
    public static void main(String args[]) {
        List<String> emp =new LinkedList<String>();
        emp.add("Prabha");
        emp.add("Sri");
        emp.add("Sanjai");
        emp.add("Santhosh");
        emp.add("Sathish");
        emp.add("Ram");
        System.out.println("All the employee names"+emp);
        List<String> emp1=new LinkedList<>();
        emp1.addAll(emp);
        Iterator<String> Itr=emp1.listIterator();
        while(Itr.hasNext()){
            System.out.println(Itr.next());
        }
        emp.clear();
        System.out.println("Clear all the datas"+emp);
        System.out.println("Copy of the datas" +emp1);
    }
}
