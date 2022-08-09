package Que;

public class Main {
    public static void main(String[] args) {
        //Car tata = new Car();
        Engine tata_engine =  new Engine(10000, 110, "tata");
        // Engine.enableTurbo(tata_engine);
        Car tata = new Car("Harrier", "Tata", "black", tata_engine);
        System.out.println("Car Model :"+tata.model);
        System.out.println("Car Company Name : "+tata.companyName);
        System.out.println("Car color : "+tata.color);
        System.out.println("Car RPM : "+tata.engine.rmp);
        System.out.println("Car Power : "+tata.engine.power);
        System.out.println("Car Enine Manufacture :"+tata.engine.manufacturer);
        System.out.println("Car Has Turbo : "+tata.engine.hasTurbo);
    }
}
