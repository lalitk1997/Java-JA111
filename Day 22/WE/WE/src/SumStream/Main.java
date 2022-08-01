package SumStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "n1", 852));
        students.add(new Student(12, "n2", 854));
        students.add(new Student(13, "n3", 851));
        students.add(new Student(14, "n4", 856));
        students.add(new Student(15, "n5", 858));

        int sumMarks = students.stream()
                .collect(Collectors.summingInt(s -> s.getMarks()));
        System.out.println("Total marks scored bu=y the students : ");
        System.out.println(sumMarks);

        // ALLMATCH, ANYMATCH, NONEMATCH METHODS
        System.out.println("Are there any students who scored more than 850 marks : ");
        boolean b = students.stream().allMatch(s -> s.getMarks() > 850);
        System.out.println(b);


    }
}
