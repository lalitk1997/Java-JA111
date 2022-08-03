//package Que1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Students> students = new ArrayList<>();
//        students.add(new Students(101, "Lalit Kumar", 200));
//        students.add(new Students(102, "Lalita Kumari", 300));
//        students.add(new Students(103, "Rupesh Patil", 150));
//        students.add(new Students(104, "Vaibhav Shahi", 500));
//
//        List<Students> studentsLessThan250Marks = students.stream()
//                .filter(s -> s.getMarks()<250)
//                .collect(Collectors.toList());
//
//        System.out.println("All students list : ");
//        students.forEach(s -> System.out.println(s.getName()+" "+s.getMarks()));
//        System.out.println("-----------------------------------------------------------");
//        System.out.println("Students who scored less than 250 marks are : ");
//        studentsLessThan250Marks.forEach(s -> System.out.println(s.getName()+" "+s.getMarks()));
//    }
//}
