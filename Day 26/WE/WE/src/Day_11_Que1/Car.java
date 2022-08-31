package Day_11_Que1;

public class Car {
    private int numberOfPassengers;
    private int numberOfKms;

    Car(int numberOfPassengers, int numberOfKms){
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfKms = numberOfKms;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfKms() {
        return numberOfKms;
    }

    public void setNumberOfKms(int numberOfKms) {
        this.numberOfKms = numberOfKms;
    }
}
