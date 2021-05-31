package Test;

public class Pattern {
    public static void main(String args[]) {
        int lenth=1;
        int count=5;
        for(int i=0;i<lenth;i++) {
            System.out.println("* ");
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
                if(j==4) {
                    lenth++;
                    count--;
                }
            }
        }
    }
}
