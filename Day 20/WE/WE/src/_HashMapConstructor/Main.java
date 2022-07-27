package _HashMapConstructor;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Student, String> stuState = new TreeMap<>(new MaxMarks());
        stuState.put(new Student(10,"Ganesh",950),"Maharastra");
        stuState.put(new Student(12,"Surya",850),"Tamilnadu");
        stuState.put(new Student(15,"Venkat",920),"Telangana");
        stuState.put(new Student(16,"Dinesh",910),"Haryana");
        stuState.put(new Student(18,"Srinu",880),"Kerla");
        System.out.println(stuState);

        Set<Map.Entry<Student, String>> keyValues = stuState.entrySet();
        for (Map.Entry<Student, String> keyVal: keyValues){
            System.out.println(keyVal.getValue()+" "+keyVal.getKey().getMark());
        }
    }
}
