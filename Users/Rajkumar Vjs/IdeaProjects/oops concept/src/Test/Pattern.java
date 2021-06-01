package Test;

public class Pattern {
    public static void main(String args[]) {
        int lenth=1;
        int count=5;
        int j=0;
        for(int i=0;i<lenth;i++) {
            System.out.println("* ");
            for ( j = 0; j < count; j++) {
                System.out.print("* ");
                break;
            }
        }
    }
}
