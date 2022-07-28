package LowerBoundWildCards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // CAN ONLY PASS OBJECTS OF PARENTS OF INTEGER CLASS
    public static void addNumbers(List<? super Integer> list){
        int sum = 0;
        //System.out.println(n);
        for (Object n:list) {
            sum = sum + (int) n ;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        addNumbers(l1);
    }
}
