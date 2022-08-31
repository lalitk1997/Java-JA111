package Day_11_Que1;

import java.util.Scanner;

public class OLA {
    public Car bookCar(int numberOfPassenger, int numberOfKMs){
        if(numberOfPassenger <= 3){
            return new HatchBack(numberOfPassenger, numberOfKMs);
        }else{
            return new Sedan(numberOfPassenger, numberOfKMs);
        }
    }
    public int calculateBill(Car car){
        int totalFare = 0;
        if(car instanceof HatchBack){
             totalFare = car.getNumberOfKms() * ((HatchBack) car).farePerKm;
             return totalFare;
        }else{
             totalFare = car.getNumberOfKms() * ((Sedan)car).farePerKm;
             return totalFare;
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numberOfPassenger = input.nextInt();
        int numberOfKms = input.nextInt();
        OLA myOla = new OLA();
        Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
        int res = myOla.calculateBill(myCar);
        System.out.println("The total fare amount is"+ res);
    }


}
