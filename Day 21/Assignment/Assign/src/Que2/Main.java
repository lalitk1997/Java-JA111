package Que2;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Delhi");
        city.add("Jaipur");
        city.add("Gurgaon");

        // PRINTING USING FOR LOOP
        System.out.println("Using for loop : ");
        for(String ele: city){
            System.out.println(ele);
        }

        // USING LAMBDA FUNCTION
        System.out.println("Using lambda func : ");
        city.forEach((value) -> System.out.println(value));
    }


}
