package YouProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> marksStu = new HashMap<>();
        marksStu.put("Gurgaon", new Student("Lalit", 100, 1024));
        marksStu.put("Delhi", new Student("Raunak", 99, 169));
        marksStu.put("Noida", new Student("Richy Rich", 400, 36));

        Set<Map.Entry<String, Student>> keyValues = marksStu.entrySet();
        System.out.println(keyValues);

        System.out.println("============================================");

        for (Map.Entry<String, Student> keyValue: keyValues){
            System.out.println(keyValue.getKey()+" "+keyValue.getValue().getName());
        }

        System.out.println("Sort by marks : ");
        // DOUBT
        
    }
}
