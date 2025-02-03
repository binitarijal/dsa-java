import java.util.HashMap;
import java.util.Map;

public class hashmaps {
    static void hasmapmethod() {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("bini", 19);
        m1.put("roshan", 20);
        m1.put("hero", 23);
        System.out.println(m1.get("hero"));
        System.out.println(m1.containsKey("roshan"));
        System.out.println(m1.remove("roshan"));
        System.out.println(m1.containsKey("roshan"));
        if (!m1.containsKey("tina")) m1.put("tina", 25);
        m1.putIfAbsent("yoyo",45);
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.entrySet());
    }


  public static void main(String[] args) {
        hasmapmethod();


    }
}


