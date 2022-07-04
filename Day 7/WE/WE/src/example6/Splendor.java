package example6;

public class Splendor extends Bike{
    @Override
    void run(){
        System.out.println("running safely at 60km/h");
    }
    void printCheck(){
        System.out.println("printCheck function.");
    }

    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}
