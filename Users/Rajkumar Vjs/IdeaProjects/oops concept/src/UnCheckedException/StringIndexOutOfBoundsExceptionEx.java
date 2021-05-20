package UnCheckedException;

public class StringIndexOutOfBoundsExceptionEx {
    public static void main(String[] args) {
        String str = "Prabhakaran S";
        for(int i = 0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.length());
        try {
            System.out.println(str.charAt(20));
        }catch(StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred...");
        }
    }
}
