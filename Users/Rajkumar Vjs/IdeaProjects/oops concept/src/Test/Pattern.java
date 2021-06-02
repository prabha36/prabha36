package Test;

public class Pattern {
    public static void main(String args[]) {
        int count=5;
        int j=0;
        int rows=4;
        int rw = 5;
        int k=0;
        for(int i=0;i<count;i++) {
            System.out.print("* ");
            for ( j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int z= rw-1; z>=0 ; z--) {
                for (k = 0; k <= rows; k++) {
                    System.out.print("* ");
                }
                System.out.println();
                /*if (k ==4)*/
                if (k == rows + 1) {
                    rows--;
                    break;
                }
            }

        }

    }
}
