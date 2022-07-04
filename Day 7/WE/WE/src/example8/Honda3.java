package example8;
public class Honda3 extends Bike{
    int speedLimit = 130;

    public static void main(String[] args) {
        Bike b1 = new Honda3();
        System.out.println(b1.speedLimit);
    }
}
