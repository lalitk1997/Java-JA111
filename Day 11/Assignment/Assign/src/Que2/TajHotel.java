package Que2;

public class TajHotel implements Hotel{
    @Override
    public void chickenBiryani() {
        System.out.println("Chicken Biryani : TajHotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("Masala Dosa : TajHotel");
    }

    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }
}
