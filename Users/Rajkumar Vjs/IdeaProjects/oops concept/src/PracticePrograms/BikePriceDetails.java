package PracticePrograms;

import java.util.Scanner;

public class BikePriceDetails {
    public void details() {
        int racerBlue=175000;
        int darkNight=180000;
        int thunderGray=170000;
        int one=1;
        int two=2;
        int three=3;
        Scanner sc= new Scanner(System.in);
        System.out.println("your option for vertion 1.BS4 2.BS6");
        int b=sc.nextInt();
        int bs4=1;
        int bs6=2;
        if(b==1) {
            System.out.println("choose the option for price Details...");
            System.out.println("1.RacerBlue 2.DarkNight 3.ThunderGray");
            System.out.println("Please enter your option : ");
            int a=sc.nextInt();
            if (a == 1) {
                System.out.println("The R15 v3 Racer blue price is : " + racerBlue);
            } else if (a == 2) {
                System.out.println("The R15 v3 Dark night price is : " + darkNight);
            } else if (a == 3) {
                System.out.println("The R15 v3 Thunder gray price is : " + thunderGray);
            }
        }
        else if(b==2){
            racerBlue=racerBlue+20000;
            darkNight=darkNight+20000;
            thunderGray=thunderGray+20000;
            System.out.println("choose the option for price Details...");
            System.out.println("1.RacerBlue 2.DarkNight 3.ThunderGray");
            System.out.println("Please enter your option : ");
            int a=sc.nextInt();
            if (a == 1) {
                System.out.println("The R15 v3 Racer blue price is : " + racerBlue);
            } else if (a == 2) {
                System.out.println("The R15 v3 Dark night price is : " + darkNight);
            } else if (a == 3) {
                System.out.println("The R15 v3 Thunder gray price is : " + thunderGray);
            }
        }
    }
    public static void main(String args[]) {
        BikePriceDetails bp=new BikePriceDetails();
        bp.details();
    }
}
