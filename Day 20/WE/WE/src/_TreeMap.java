import java.util.TreeMap;

public class _TreeMap {
    public static void main(String[] args){
        TreeMap<String, String> stateCapital = new TreeMap<>();
        stateCapital.put("Maharashtra", "Mumbai");
        stateCapital.put("Bihar", "Patna");
        stateCapital.put("Haryana", "Chandigarh");
        stateCapital.put("Uttar Pradesh", "Pyagraj");
        stateCapital.put("Rajasthan", "Jaipur");
        System.out.println(stateCapital);
    }
}
