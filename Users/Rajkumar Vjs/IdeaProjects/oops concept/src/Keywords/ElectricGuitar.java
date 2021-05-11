package Keywords;

public class ElectricGuitar extends Instruments1 {

    public ElectricGuitar() {
        this.name = "Electric Guitar";
        this.numbers = 30;
    }

    public ElectricGuitar(int numbers) {
        this.name = "Electric Guitar";
        this.numbers = numbers;
    }

    public void play() {
        System.out.println("" + numbers + "" + name + "");
    }
}
