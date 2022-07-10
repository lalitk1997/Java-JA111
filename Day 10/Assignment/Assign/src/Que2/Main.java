package Que2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Area a1 = new Area();
        System.out.println("Rectangle : ");
        System.out.println("Enter Length : ");
        int length = input.nextInt();
        System.out.println("Enter Breadth : ");
        int breadth = input.nextInt();
        System.out.println("Area of Rectangle : "+a1.rectangleArea(length, breadth));
        System.out.println("Square");
        System.out.println("Enter Side : ");
        int side = input.nextInt();
        System.out.println(a1.squareArea(side));
        System.out.println("Circle : ");
        System.out.println("Enter Radius : ");
        int radius = input.nextInt();
        System.out.println(a1.circleArea(radius));
    }
}
