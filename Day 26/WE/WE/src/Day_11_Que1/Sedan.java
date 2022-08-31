package Day_11_Que1;

public class Sedan extends Car{
    final int farePerKm = 20;

    Sedan(int numberOfPassengers, int numberOfKms) {
        super(numberOfPassengers, numberOfKms);
    }

    public int fareSedan(Sedan car){
        return car.farePerKm;
    }
}
