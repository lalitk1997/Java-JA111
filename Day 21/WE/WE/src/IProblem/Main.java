package IProblem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student(10, "Lalit", 800));
        stu.add(new Student(20, "Rahnikant", 400));

        Collections.sort(stu, (s1, s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);
        System.out.println(stu);
    }
}
