class ParameterC {
    ParameterC(int a ,int b) {
        int c= a+b;
        System.out.println(" Parameter value : "+c);
    }
   ParameterC( ) {
        System.out.println("No parameter");
    }
    ParameterC(int a) {
        System.out.println("Different parameter"+a);
    }
}

public class ParameterConstructor {
    public static void main(String args[]) {
        ParameterC pc = new ParameterC(10, 30);
        ParameterC pc1 = new ParameterC(100);
        ParameterC pc2= new ParameterC();
    }
}
