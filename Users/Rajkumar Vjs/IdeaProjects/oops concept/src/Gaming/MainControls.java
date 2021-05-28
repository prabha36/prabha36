package Gaming;

public class MainControls {
    public static void main(String args[]) {
        System.out.println("Select your game 1.GTA 2.WWE 3.PUBG 4.Contra");
        int GTA=1;
        int WWE=2;
        int PUBG=3;
        int Contra=4;
        //Scanner scan=new Scanner(System.in);
        //int s=sc.nextInt();
        System.out.println("Press the button : ");
        System.out.println("1.Jump 2.Block 3.Run 4.Punch");
        ActionPunch1 game = new ActionPunch1();
        game.actionpunch();
       /* game.actionrun();
        game.actionBlock();
        game.actionJump();*/
        /*Gaming game=new Gaming();
        game.actionpunch();*/
        // int g=sc.nextByte();
       /* if(g==x) {
            Gaming game=new Gaming();
            game.actionJump();
        }
        else if(g==o){
            Gaming game= new Gaming();
            game.actionBlock();
        }
        else if(g==a){
            Gaming game = new Gaming();
            game.actionrun();
        }
        else if(g==p) {
            Gaming game = new Gaming();
            game.actionpunch();
        }*/
    }

}
