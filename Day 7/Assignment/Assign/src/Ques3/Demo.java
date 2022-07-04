package Ques3;

import java.util.Scanner;

public class Demo extends Student{
    Demo(int roll, String name, String address, int marks){
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return roll+" "+name+" "+address+" "+marks;
    }
    static int averageMarks(Demo[] stuArr, int studentCount){
        int sum = 0;
        int avg = 0;
        for(int i=0; i<studentCount; i++){
            sum +=  stuArr[i].marks;
        }
        avg = (sum/studentCount);
        return avg;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of students whose data to be filled : ");
        int noOfObj = input.nextInt();
        Demo[] stu = new Demo[noOfObj];
        for (int i=0; i<noOfObj; i++){
            System.out.println("Enter Roll No : ");
            int roll = input.nextInt();
            System.out.println("Enter Name : ");
            //int temp = input.nextInt();
            String name = input.next();
            System.out.println("Enter Address : ");
            String address = input.next();
            System.out.println("Enter Marks : ");
            int marks = input.nextInt();
            stu[i] = new Demo(roll, name, address, marks);
        }
        for (int i=0; i<noOfObj; i++){
            System.out.println(stu[i].toString());;
        }
        System.out.println("Average Marks scored : ");
        System.out.println(averageMarks(stu, noOfObj));
    }
}
