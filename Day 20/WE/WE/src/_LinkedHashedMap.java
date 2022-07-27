import java.util.LinkedHashMap;
import java.util.Map;

public class _LinkedHashedMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(100, "Amit");
        hm.put(200, "Vijay");
        hm.put(102, "Rahul");

        for (Map.Entry<Integer, String> keyVal: hm.entrySet()){
            System.out.println(keyVal.getKey()+" "+keyVal.getValue());
        }
    }
}
