package CheckedException;

import java.io.IOException;
class IOExceptionEx{
    void method()throws IOException{
        throw new IOException("device error");
    }
    void method1()throws IOException{
        method();
    }
    void method2(){
        try {
            method1();
        } catch(Exception e) {
            System.out.println("exception handled");
        }
        //method1();
    }
    public static void main(String args[]){
        IOExceptionEx obj=new IOExceptionEx();
        obj.method2();
        System.out.println("normal flow...");
    }
}
