package Que3;

import java.util.Scanner;

public class Main {
    public static Person generatePerson(Person person){
        if(person instanceof Instructor){
            Instructor objI = (Instructor) person;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Instructor Id : ");
            int instructorId = input.nextInt();
            System.out.println("Enter Instructor Salary : ");
            int salary = input.nextInt();
            objI.instructorId = instructorId;
            objI.salary = salary;
//            Address obj = new Address();
//            System.out.println("Enter Instructor City : ");
//            String city = input.next();
//            System.out.println("Enter Instructor Pincode : ");
//            String pincode = input.next();
//            System.out.println("Enter Instructor State : ");
//            String state = input.next();
            return objI;
        }else{
            Student objS = (Student) person;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Student Id : ");
            int studentId = input.nextInt();
            System.out.println("Enter Student Course : ");
            String courseEnrolled = input.next();
            System.out.println("Enter Course Fees : ");
            int courseFee = input.nextInt();
            objS.studentId = studentId;
            objS.courseEnrolled = courseEnrolled;
            objS.courseFee = courseFee;
            return objS;
        }
    }

    public static void main(String[] args) {
        Person newInstructor = generatePerson(new Instructor());
        Person newStudent = generatePerson(new Student());
        System.out.println(newInstructor);
        System.out.println(newStudent);
    }
}
