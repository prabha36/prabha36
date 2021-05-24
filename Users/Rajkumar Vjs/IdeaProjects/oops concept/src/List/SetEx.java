package List;

import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<String> Subject = new HashSet<String>();
        Subject.add("CNS");
        Subject.add("DAA");
        Subject.add("M2");
        Subject.add("OS");
        Subject.add("PT");
        //Subject.remove(2);
        //Subject.add(null);
        Iterator<String> Itr=  Subject.iterator();
        while(Itr.hasNext()){
            System.out.println(Itr.next());
        }
        Set<String> Subject1= new TreeSet<String>();
        Subject1.addAll(Subject);
        System.out.println(Subject1);

        Set<String> Subject2=new LinkedHashSet<String>();
        Subject2.addAll(Subject);
        System.out.println(Subject2);
    }
}
