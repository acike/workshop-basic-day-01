import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> persons = new HashMap<>();
        persons.put("pui", 35);
        persons.put("somkiat", 40);
        persons.put("pui", 50);

        Set<String> keys = persons.keySet();
        for (String key : keys) {
            System.out.println(key + "=>" + persons.get(key));
        }
    }
}
