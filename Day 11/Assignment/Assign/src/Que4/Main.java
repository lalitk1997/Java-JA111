package Que4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        List<Integer> arr = t.display(17);
        for(int i = 0; i< arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
