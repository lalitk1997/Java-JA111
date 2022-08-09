package Que4;

public class Laptop {
    String color;
    String companyName;
    String name;
    String purpose;
    CPU cpu;
    GraphicCard graphicCard;

    void displayDetails(){
        System.out.println("Laptop Name : "+this.name);
        System.out.println("Company Name : "+this.companyName);
        System.out.println("Laptop Color : "+this.color);
        System.out.println("Laptop Purpose : "+this.purpose);
        System.out.println("Cpu's Manufacturer");
    }

    public Laptop(String color, String companyName, String name, String purpose, CPU cpu, GraphicCard graphicCard) {
        this.color = color;
        this.companyName = companyName;
        this.name = name;
        this.purpose = purpose;
        this.cpu = cpu;
        this.graphicCard = graphicCard;
    }
}
