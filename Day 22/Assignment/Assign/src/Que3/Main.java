package Que3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Lalit Kumar", 300));
        students.add(new Student(102, "Rishi Kapoor", 200));
        students.add(new Student(103, "Rishi Subak", 100));
        students.add(new Student(104, "Nikki Palosi", 400));
        students.add(new Student(105, "Donals Trump", 899));

        List<Employee> employees = students.stream()
                .map(s -> new Employee((int)s.getRoll(), (String)s.getName(), s.getMarks()*1000))
                .collect(Collectors.toList());
        System.out.println("Students OBJ are mapped to Employee OBJ : ");
        employees.forEach(s -> System.out.println(s.getEmpId()+" "+s.getEmpName()+" "+s.getSalary()));
    }
}
