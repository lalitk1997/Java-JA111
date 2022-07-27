package WeProblem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();
        // SET KEY VALUE PAIR
        hm.put("Delhi", new Student(10, "Lalit", 100));
        hm.put("Gurgaon", new Student(20, "Renuka", 200));
        hm.put("Maharashtra", new Student(30, "Rupak", 300));
        // PRINTS STATE NAME AND REFERENCE ADDRESS
        System.out.println(hm);
        // ALL STATE NAME
        Set<String> stateName = hm.keySet();
        // ALL STUDENT CLASS REFERENCE
        Collection<Student> studentsRef = hm.values();
        List<Student> studentReference = new ArrayList<>(studentsRef);
        for (Student student:studentReference){
            System.out.println(student.getName()+" "+student.getRoll()+" "+student.getMark());
        }

        Set<Map.Entry<String, Student>> keyValues = hm.entrySet();
        for (Map.Entry<String, Student> me : keyValues){
            System.out.println(me.getKey()+" "+me.getValue().getName()+" "
                    +me.getValue().getRoll()+" "+me.getValue().getMark());
        }

    }
}
