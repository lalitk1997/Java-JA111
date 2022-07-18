package Que4;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String str =  input.next();
        try{
            int num = parseInt(str);
            System.out.println("Square of the number is : "+num*num);
        }catch (NumberFormatException e){
            System.out.println("Entered input is not a valid format for an integer");
        }
    }
}
