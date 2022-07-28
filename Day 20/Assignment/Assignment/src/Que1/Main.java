package Que1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> stateCapital = new HashMap<>();
        stateCapital.put("Haryana", "Chandigarh");
        stateCapital.put("Bihar", "Patna");
        stateCapital.put("Uttar Pradesh", "Lucknow");
        stateCapital.put("Madhya Pradesh", "Bhopal");
        stateCapital.put("Uttarakhand", "Dehradun");

        // PRINTING KEY
        Set<String> states = stateCapital.keySet();
        for (String state: states){
            System.out.println(state);
        }
        System.out.println("=============================");

        // PRINTING VALUES
        Collection<String> capitals = stateCapital.values();
        for (String capital: capitals){
            System.out.println(capital);
        }
        System.out.println("=============================");

        // PRINTING KEY VALUE PAIR
        Set<Map.Entry<String, String>> objStateCapital = stateCapital.entrySet();
        for (Map.Entry<String, String> obj : objStateCapital){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }
        System.out.println("=============================");
    }
}
