package example7;

public class Apache extends Bike{
    @Override
    void run() {
        System.out.println("Apache running...");
    }

    public static void main(String[] args) {
        Bike b1 = new Apache();
        b1.run();
        Apache b2 = new Apache();
        b2.run();
    }
}
