package Gaming;

import java.util.Scanner;

public class ActionPunch1 extends ActionRun1 {
    public void actionpunch() {
        double punchpower = 0.0;
        int p = 4;
        Scanner sc = new Scanner(System.in);
        int g = sc.nextByte();
        if (g == p) {
            punchpower = punchpower = 0.5;
            System.out.println("You punch your enemy : ");
            System.out.println("The power of punch is increased : " + punchpower);
        }
    }
}
