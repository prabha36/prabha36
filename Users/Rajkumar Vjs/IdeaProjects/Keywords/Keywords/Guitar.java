package Keywords;

public class Guitar extends Instruments1 {

    public Guitar() {

        this.name = "Guitar";
        this.numbers = 10;
    }

    public Guitar(int numbers) {

        this.name = "Guitar";
        this.numbers = numbers;
    }

    public void play() {
        System.out.println("" + numbers + "" + name + "");
    }
}