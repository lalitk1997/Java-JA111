package Que2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Student, String> studentState = new TreeMap<>(new StudentImpl());
        studentState.put(new Student(31, "Ramesh", 599), "Haryana");
        studentState.put(new Student(10, "Lalit", 300), "Delhi");
        studentState.put(new Student(20, "Kunal", 460), "Noida");
        // System.out.println(studentState);

        Set<Map.Entry<Student, String>> objStudents = studentState.entrySet();
        // System.out.println(objStudents);
        for (Map.Entry<Student, String> objStudent : objStudents){
            System.out.println("Roll : "+objStudent.getKey().getRoll()+
                    " Name : "+objStudent.getKey().getName()+
                    " Marks : "+objStudent.getKey().getMarks()+
                    " ---> State : "+objStudent.getValue());
        }
        System.out.println("===================================================");

    }
}
