package Que1;

import java.util.Scanner;

public class AllStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name (Science Student) : ");
        String name = input.next();
        System.out.println("Enter address : ");
        String address = input.next();
        System.out.println("Enter Physics Marks : ");
        int physicsMarks = input.nextInt();
        System.out.println("Enter Chemistry Marks : ");
        int chemistryMarks = input.nextInt();
        System.out.println("Enter Math Marks : ");
        int mathMarks = input.nextInt();
        ScienceStudent science = new ScienceStudent(name, address, physicsMarks, chemistryMarks, mathMarks);
        System.out.println(science.toString());
        System.out.println("Percentage : "+science.getPercentage(physicsMarks, chemistryMarks, mathMarks));
        System.out.println("-------------------------------");
        System.out.println("Enter name (History Student) : ");
        String nameH = input.next();
        System.out.println("Enter address : ");
        String addressH = input.next();
        System.out.println("Enter History Marks : ");
        int historyMarks = input.nextInt();
        System.out.println("Enter Civics Marks : ");
        int civicsMarks = input.nextInt();
        System.out.println("Enter Geography Marks : ");
        int geographyMarks = input.nextInt();
        HistoryStudent history = new HistoryStudent(nameH, addressH, historyMarks, civicsMarks, geographyMarks);
        System.out.println(history.toString());
        System.out.println("Percentage : "+history.getPercentage(historyMarks, chemistryMarks, geographyMarks));
    }
}
