package Que2;

import java.util.Scanner;

public class Demo {
    public Hotel provideFood(int amount){
        if(amount > 1000){
            return new TajHotel();
        }else if(amount > 200 & amount < 1000){
            return new RoadSideHotel();
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int amt = input.nextInt();
        Demo obj = new Demo();
        if(obj.provideFood(amt) != null){
            if(obj.provideFood(amt) instanceof TajHotel){
                TajHotel objTJ = (TajHotel) obj.provideFood(amt);
                objTJ.welcomeDrink();
                objTJ.chickenBiryani();
                objTJ.masalaDosa();
            }else if(obj.provideFood(amt) instanceof RoadSideHotel){
                RoadSideHotel objRS = (RoadSideHotel) obj.provideFood(amt);
                objRS.chickenBiryani();
                objRS.masalaDosa();
            }
        }else{
            System.out.println("Enter Valid Amount...");
        }
    }
}
