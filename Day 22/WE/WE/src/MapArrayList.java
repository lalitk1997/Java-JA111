import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lalit Kumar");
        names.add("Suresh");
        names.add("Mukesh Yadav");
        names.add("Radvijay");

        List list = names.stream().map(s -> "Welcome "+s).collect(Collectors.toList());
        list.forEach(s -> System.out.println(s));
    }
}
