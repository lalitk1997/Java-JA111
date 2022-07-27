import java.util.HashMap;
import java.util.Map;

public class _HashMap {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        System.out.println(hm);
        hm.put(1, "Lalit");
        hm.put(2, "Rupesh");
        hm.put(3, "Suresh");
        hm.put(4, "Ramesh");
        System.out.println(hm);
        hm.put(4, "Natlia");
        hm.put(null, "Kalia");
        System.out.println(hm);
        System.out.println(hm.size());
    }
}
