package Collections;
import java.util.HashMap;
public class HashMap1 {
    public static void main(String args[]) {
        HashMap <String, Integer> value =new HashMap();
        value.put("prabha", 36);
        value.put("sanjai", 41);
        value.put("sri", 52);
        value.put("ram", 40);
        System.out.println(""+ value.size());
        System.out.println("" + value);

        if(value.containsKey("prabha")) {
            Integer a =value.get("prabha");
            System.out.println(a);
        }
    }
}