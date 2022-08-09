package Que;

public class Engine {
    int rmp;
    int power;
    String manufacturer;
    boolean hasTurbo;

    public static void enableTurbo(Engine engine){
        engine.hasTurbo = true;
    }

    public Engine(int rmp, int power, String manufacturer) {
        this.rmp = rmp;
        this.power = power;
        this.manufacturer = manufacturer;
        this.hasTurbo = false;
    }
}
