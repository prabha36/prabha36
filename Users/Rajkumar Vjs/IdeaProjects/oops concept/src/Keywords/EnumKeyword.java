package Keywords;

enum Day{
    SPRING, SUMMER, WINTER, FALL;
}

public class EnumKeyword {
    Day weahter;
    public EnumKeyword(Day weahter){
        this.weahter=weahter;
    }
    public void Checkweather() {
        switch (weahter) {
            case SPRING:
                System.out.println("Feels so good");
                break;
            case SUMMER:
                System.out.println("Very hot");
                break;
            case WINTER:
                System.out.println("Very cold");
                break;
            case FALL:
                System.out.println("Its Beautifull");
                break;
            default:
                System.out.println("All weathers are good");
                break;
        }
    }
    public static void main(String args[]) {
        EnumKeyword ek = new EnumKeyword(Day.WINTER);
        ek.Checkweather();
    }
}
