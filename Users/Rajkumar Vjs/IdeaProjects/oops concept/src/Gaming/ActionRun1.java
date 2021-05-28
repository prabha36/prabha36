package Gaming;

import java.util.Scanner;

public class ActionRun1 extends ActionBlock1 {
    public void actionrun() {
        int a = 3;
        double runpower = 0.0;
        Scanner sc = new Scanner(System.in);
        int g = sc.nextByte();
        if (g == a) {
            runpower = runpower = 0.5;
            System.out.println("You run from the Standing position : ");
            System.out.println("The power of run is increased : " + runpower);
        }
    }
}
