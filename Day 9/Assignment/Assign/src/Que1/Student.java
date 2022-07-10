package Que1;

import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }

    public void displayDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Roll No : ");
        int roll = input.nextInt();
        System.out.println("Enter Student Name : ");
        String name = input.next();
        System.out.println("Enter Student Marks : ");
        int marks = input.nextInt();
        char grade = calculateGrade(marks);
        Student s1 = new Student(roll, name, marks, grade);
        System.out.println(s1.toString());
    }
    private char calculateGrade(int marks){
        if(marks >= 500){
            return 'A';
        }else if(marks < 500 && marks >=400){
            return 'B';
        }else if(marks < 400){
            return 'C';
        }
        return 'X';
    }
    Student(){

    }
    Student(int roll, String name, int marks, char grade){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }
}
