package Que4;

import java.util.Scanner;

public class Main {

    public static Laptop getLaptop(String laptopPurpose){
        Laptop acer = new Laptop("Balck", "Radeon", "Acer", "gaming",
                new CPU("Radeon", "Ryzen 9 5800H", 3200.0),
                new GraphicCard("Radeon", "RTX 3050 Ti", "16GB"));

        Laptop aero = new Laptop("Rose Gold", "HP", "Aero 13", "business",
                new CPU("Intel", "i5 10210U", 1800.0),
                new GraphicCard("Intel", "Integrated", "Iris Xe"));
        if(laptopPurpose.equals("gaming")){
            return acer;
        }else if (laptopPurpose.equals("business")){
            return aero;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {


        System.out.println("Enter Purpose : ");
        Scanner in = new Scanner(System.in);
        String purpose = in.next();


        Laptop gamingLaptop=getLaptop("gaming");//You need to take input Using Scanner Class
        gamingLaptop.displayDetails();
        Laptop bussinessLaptop=getLaptop("business");//You need to take input Using Scanner Class
        bussinessLaptop.displayDetails();
        Laptop laptop=getLaptop("Entertainment");//You need to take input Using Scanner Class
        laptop.displayDetails();
    }
}
