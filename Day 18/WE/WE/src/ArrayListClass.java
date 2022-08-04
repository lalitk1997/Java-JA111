import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(20);
        // ADDING ELEMENTS TYPE STRING
        System.out.println("Adding Elements : ");
        list.add("Lalit");
        list.add("Raman");
        list.add("Ram");
        list.add("Rupesh");
        list.add("Vainhav");
        list.add("Sukhmani");
        list.add("Vaishnavi");
        list.add("Raj");
        list.add(null);

        // DISPLAY LIST
        System.out.println("Printing all Elements : ");
        System.out.println(list);

        // ADDING ELEMENT AT A GIVEN IDX
        list.add(0, "Lalit Kumar");
        System.out.println(list);

        // REPLACE AN ELEMENT
        list.set(7, "Vaishali");
        System.out.println(list);

        // RETURN ELEMENT AT A GIVEN IDX
        System.out.println(list.get(0));
        System.out.println(list);

        // REMOVE AN ELEMENT
        System.out.println(list.remove(0));
        System.out.println(list);

        // RETURN IDX IF SAME ELEMENT EXISTS
        System.out.println(list.indexOf(null));

        // PRINTS SIZE
        System.out.println(list.size());

        // INSERTING DUPLICATE ELEMENT
        list.add("Lalit");
        System.out.println(list);

        // TRAVERSING LIST - 1
        System.out.println("Traversing using normal for() ...");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));

        // TRAVERSING LIST - 2
        System.out.println("Traversing using enhanced for() ...");
        for(String ele : list){
            System.out.println(ele);
        }

        // TRAVERSING LIST - 3
        System.out.println("Traversing using Lambda func() ...");
        list.forEach(element -> System.out.println(element));

        // TRAVERSING LIST - 4
        System.out.println("Traversing list using iterator ...");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String s = itr.next();
            System.out.println(s);
        }
    }
}
