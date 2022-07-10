package Que2;

public class Main {
    public static void main(String[] args) {
        Area a1 = new Area();
        System.out.println("Enter Length : ");
        System.out.println("Enter Breadth : ");

        System.out.println("Area of Rectangle : "+a1.rectangleArea(10, 20));
        System.out.println(a1.squareArea(10));
        System.out.println(a1.circleArea(10));
    }
}
