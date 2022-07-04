package example3;

public class Bike extends Vehicle{
    @Override
    void run() {
        System.out.println("Bike is running safely... (inside bike class)");
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.run();
    }
}
