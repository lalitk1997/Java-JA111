package example7;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new AXIS();
        Bank b2 = new ICICI();
        Bank b3 = new SBI();
        b1.getRateOfInterest();
        b2.getRateOfInterest();
        b3.getRateOfInterest();
    }
}
