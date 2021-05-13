package Multithread;

class IsAlive extends Thread {
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Is thread alive in run() method" + Thread.currentThread().isAlive());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        IsAlive alive = new IsAlive();
        System.out.println("Is thread alive before start() call:" + alive.isAlive());
        alive.start();
        System.out.println("Is thread alive after start() call:" + alive.isAlive());
    }
}
