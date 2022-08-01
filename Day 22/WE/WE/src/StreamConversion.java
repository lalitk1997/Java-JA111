import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamConversion {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Gurgaon");
        cities.add("Lucknow");
        cities.add("Suratkal");

        Stream<String> ss = cities.stream();
        System.out.println("Printing the stream : ");
        ss.forEach(ele -> System.out.println(ele));

    }
}
