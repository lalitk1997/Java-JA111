package example7;

public class SBI extends Bank{
    @Override
    double getRateOfInterest() {
        System.out.println("SBI Func..");
        return 4.3;
    }
};
