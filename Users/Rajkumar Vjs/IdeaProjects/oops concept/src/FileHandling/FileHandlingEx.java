package FileHandling;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandlingEx {
    public static void main(String args[]) {
        File file = new File("D:\\DemoWork\\Demo.txt");
        try {
            FileOutputStream fileio=new FileOutputStream(file);
            byte[] b={100,67,80,90};
            //fileio.write(100);
            if (!file.exists()) {
                file.createNewFile();
            }
            else{
                //file.delete();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
