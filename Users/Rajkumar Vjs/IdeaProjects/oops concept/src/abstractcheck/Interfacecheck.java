package abstractcheck;

public interface Interfacecheck {

    public void display_i();
    public int d = 10;

    default void print(){
        System.out.println("Check interface");
    }
}
