package Day_11_Que1;

public class HatchBack extends Car{
    final int farePerKm = 15;

    HatchBack(int numberOfPassengers, int numberOfKms) {
        super(numberOfPassengers, numberOfKms);
    }

    public int fareHatchBack(HatchBack car){
        return car.farePerKm;
    }

}
