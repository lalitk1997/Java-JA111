package ex11;

public class TajHotel implements Hotel{
    @Override
    public void pudding() {
        System.out.println("Pudding from Taj Hotel...");
    }

    @Override
    public void iceCream() {
        System.out.println("Ice-Cream from Taj Hotel...");
    }

    public void idli(){
        System.out.println("Special-Idli (Taj Hotel Only)...");
    }
}
