package Que2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Student students = new Student();
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Lalit Kumar", 300));
        students.add(new Student(102, "Rishi Kapoor", 200));
        students.add(new Student(103, "Rishi Subak", 100));
        students.add(new Student(104, "Nikki Palosi", 400));
        students.add(new Student(105, "Donals Trump", 899));

        System.out.println("List of all students : ");
        students.forEach(s -> System.out.println("Name : "+s.getName()+", Roll No : "+s.getRoll()+", Marks : "+s.getMarks()));

        System.out.println("Filter : List of all students whose marks is less than 800 : ");
        List<Student> filterStudentsByMarks = students.stream()
                .filter(s -> s.getMarks() < 800)
                .collect(Collectors.toList());
        filterStudentsByMarks.forEach(s -> System.out.println("Name : "+s.getName()+", Roll No : "+s.getRoll()+", Marks : "+s.getMarks()));
    }
}
