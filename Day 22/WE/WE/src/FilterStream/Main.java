package FilterStream;

import PrintStudentMarks.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Student obj = new Student();
        List<Student> stuObj = new ArrayList<>();
        stuObj.add(new Student(10, "Lalit", 300));
        stuObj.add(new Student(20, "Pratap", 400));
        stuObj.add(new Student(30, "Rohini", 500));
        stuObj.add(new Student(40, "Yogesh", 599));

        // PRINTING STUDENT ARRAYLIST
        System.out.println("PRINTING USING FOR LOOP : ");
        for(Student  student : stuObj){
             System.out.println(student.toString());
        }

        // PRINTING USING LAMBDA FUNC
        System.out.println("PRINTING USING LAMBDA FUNCTION");
        stuObj.forEach(stu -> System.out.println(stu));

        // FILTERING MARKS GREATER THAN 500;
        System.out.println("STUDENTS WHO SCORED GREATER THAN 500 MARKS");
        stuObj.stream()
                .filter(s -> s.getMarks() > 500)
                .forEach(s -> System.out.println(s.getName()));


    }
}
