package Serialization;

import java.io.*;

public class SerializationCheck implements Serializable {
    int id;
    String name;

    public SerializationCheck(int id, String name){
        this.id=id;
        this.name=name;
    }
}
/*class serCheck {
    public static void main(String args[]) throws Exception {
        SerializationCheck sc =new SerializationCheck(36,"prabha");
        FileOutputStream fout =new FileOutputStream("D:Github.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(sc);

        out.flush();
        System.out.println("Success");

    }
}*/
class dSerCheck {
    public static void main(String args[]) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:Github.txt"));
        SerializationCheck sc1=(SerializationCheck)in.readObject();
        System.out.println(sc1.id + " " + sc1.name);
        in.close();

    }
}


