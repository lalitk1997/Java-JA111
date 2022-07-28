import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class WithoutGenerics {
    // WITHOUT GENERICS --> ANY TYPE OF OBJECT CAN BE SAVED IN ARRAYLIST
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Lalit"); // STRING OBJECT
        list.add(1); // INTEGER OBJECT
        list.add(10.00f);
        list.add(10.0002);
        for(Object ele:list){
            System.out.println(ele);
        }
        System.out.println("==============================");
        System.out.println("NEED TO DOWNCAST TO STORE ELEMENTS : ");
        String str = (String) list.get(0);
        System.out.println(str);
        int num = (int) list.get(1);
        System.out.println(num);
    }
}


