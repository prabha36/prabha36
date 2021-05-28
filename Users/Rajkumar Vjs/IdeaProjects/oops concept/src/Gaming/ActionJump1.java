package Gaming;

import java.util.Scanner;

class ActionJump1 {

    public void actionJump() {
        int x = 1;
        double jumppower = 0.0;
        Scanner sc = new Scanner(System.in);
        int g = sc.nextByte();
        if (g == x) {
            jumppower = jumppower + 0.5;
            System.out.println("You jumped from the standing position : ");
            System.out.println("The power of jump is increased : " + jumppower);
        }
    }
}