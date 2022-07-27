import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _List {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 10, 9, 8 );
        System.out.println("Before Sorting : "+list);
        Collections.sort(list);
        System.out.println("After Sorting : "+list);

        System.out.println("Sorting in Descending Order : ");
        Collections.reverse(list);
        System.out.println(list);
    }
}
