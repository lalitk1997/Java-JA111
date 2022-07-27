import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class _ArraysClass {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }
        System.out.println(arr); // PRINTS ADDRESS
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]); // PRINTS ARRAY ELEMENTS ONE BY ONE
        }
        System.out.println("--------------------");
        // ARRAY CLASS
        // WITHIN UTIL PACKAGE
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // CREATING LIST
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");
        System.out.println(list);
    }
}
