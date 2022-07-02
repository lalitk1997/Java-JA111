package example7;

public class ICICI extends Bank {
    @Override
    double getRateOfInterest(){
        System.out.println("ICICI Func..");
        return 4.3;
    }
}
