package WEProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Name1", 850));
        students.add(new Student(12, "Name2", 750));
        students.add(new Student(13, "Name3", 650));
        students.add(new Student(14, "Name4", 950));
        students.add(new Student(15, "Name5", 750));

        List<Student> filterStudents = students.stream().
                filter(s -> s.getMarks() > 800).
                collect(Collectors.toList());

        for (Student student : students){
            System.out.println(student.getRollNo()+" : "+student.getName()+" : "+student.getMarks());
        }
    }
}
