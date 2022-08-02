package Que2;

import java.util.Scanner;

public class Main {

    static int num1;
    static int num2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try{
            System.out.println("The quotient of "+num1+"/"+num2+" = "+(int)(Math.floor(num1/num2)));
        }catch (ArithmeticException e){
            System.out.println("DivideByZeroException caught...");
        }finally {
            System.out.println("Inside Finally block");
        }
    }
}
