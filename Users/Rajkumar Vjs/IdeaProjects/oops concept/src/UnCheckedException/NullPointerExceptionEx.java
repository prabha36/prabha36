package UnCheckedException;

public class NullPointerExceptionEx extends Throwable {
    private static Object String;

    public static void main(String args[]) {
        String name = "prabha";
        String ID = null;
        try {
            System.out.println("Your details is");
            /*int n=ID.length();*/
            System.out.println(name + " " + ID.length());
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            //System.out.println("can't be find the lenth() of null value"+e);
        }
    }
}
