package I_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "name1", 850));
        students.add(new Student(12,"name2",450));
        students.add(new Student(14,"name3",950));
        students.add(new Student(15,"name4",550));
        students.add(new Student(16,"name5",650));

        Collections.sort(students, new StudentMarksComp());

        for (Student student:students){
            System.out.println("Marks : "+student.getMark());
        }
    }
}
