package Keywords;

public class Execution {

    public static void main(String[] args) {
        ElectricGuitar g1 = new ElectricGuitar();
        Guitar g2 = new Guitar();
        g1.play();
        g2.play();
        g1 = new ElectricGuitar(20);
        g2 = new Guitar(40);
        g1.play();
        g2.play();
    }
}
