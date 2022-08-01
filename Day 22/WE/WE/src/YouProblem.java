import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class YouProblem {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // SETTING DIFFERENT STRINGS
        list = Arrays.asList("Lalit", "Chandra", "Saurabh", "Hena", "Yamraj");
        System.out.println("Data within the list : ");
        list.forEach(s -> System.out.println(s));

        // LENGTH OF THE STRING IS STORED
        List<Integer> list2 = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        // EVEN LENGTH IS FILTERED OUT
        List<Integer> list3 = list2.stream()
                .filter(s -> s%2 == 0)
                .collect(Collectors.toList());

        System.out.println("Length of each string : ");
        list2.forEach(s -> System.out.println(s));

        System.out.println("Even length string : ");
        list3.forEach(s -> System.out.println(s));
    }
}
