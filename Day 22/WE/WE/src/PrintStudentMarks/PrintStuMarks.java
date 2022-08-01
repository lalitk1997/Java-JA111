package PrintStudentMarks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrintStuMarks {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Lalit Kumar", 340));
        students.add(new Student(20, "Mona Lisa", 450));
        students.add(new Student(30, "Cleopatra", 599));
        students.add(new Student(50, "James Bond 007", 200));

        Stream<Student> studentStream = students.stream();
        studentStream.forEach(student -> System.out.println(student.name+" : "+student.marks));
    }
}
