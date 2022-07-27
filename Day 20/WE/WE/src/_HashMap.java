import java.util.*;

public class _HashMap {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        System.out.println(hm);
        // SETTING KEY VALUE PAIRS
        hm.put(1, "Lalit");
        hm.put(2, "Rupesh");
        hm.put(3, "Suresh");
        hm.put(4, "Ramesh");
        System.out.println(hm);
        // DUPLICATE KEY WITH DIFFERENT VALUE
        hm.put(4, "Natlia");
        hm.put(null, "Kalia");
        System.out.println(hm);
        System.out.println(hm.size());
        // ITERATE OVER HASHMAP
        // KEYS
        System.out.println("Getting Keys : ");
        Set<Integer> keys = hm.keySet();
        for (Integer key:keys){
            System.out.println(key);
        }
        System.out.println("====================");
        // VALUES
        System.out.println("Getting Values : ");
        Collection<String> values = hm.values();
        for (String value: values){
            System.out.println(value);
        }
        System.out.println("=====================");
        System.out.println("Getting both KEYS and VALUES : ");
        Set<Map.Entry<Integer, String>> keyValues = hm.entrySet(); // DOUBT // RETURNS SET VIEW OF THE MAPPING
        for (Map.Entry<Integer, String> me : keyValues){
            System.out.println(me.getKey() +" : "+me.getValue());
        }
        System.out.println(keyValues);
    }
}
