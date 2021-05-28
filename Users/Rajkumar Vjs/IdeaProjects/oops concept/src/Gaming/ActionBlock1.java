package Gaming;

import java.util.Scanner;

public class ActionBlock1 extends ActionJump1 {
    public void actionBlock() {
        int o = 2;
        double blockpower = 0.0;
        Scanner sc = new Scanner(System.in);
        int g = sc.nextByte();
        if (g == o) {
            blockpower = blockpower + 0.5;
            System.out.println("You block the Enemies attack : ");
            System.out.println("The power of block is increased : " + blockpower);
        }
    }
}
