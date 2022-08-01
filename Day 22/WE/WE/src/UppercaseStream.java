import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class UppercaseStream {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Gurgaon");
        cities.add("Delhi");
        cities.add("Lucknow");
        cities.add("Jaipur");
        cities.add("Udaipur");
        cities.add("Hathras");

        System.out.println("Printing all cities name : ");
        cities.forEach(s -> System.out.println(s));

        List citiesUpper = cities.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Printing all cities in UPPERCASE : ");
        citiesUpper.forEach(s -> System.out.println(s));

        List citiesLower = cities.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println("Printing all cities in Lowercase : ");
        citiesLower.forEach(s -> System.out.println(s));
    }
}
