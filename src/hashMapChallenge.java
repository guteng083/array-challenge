import java.util.HashMap;
import java.util.Map;

public class hashMapChallenge {
    public static void main(String[] args) {
        // 1. Buat empty HashMap yang memetakan String ke Integer
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map);

        // 2. Put single entry ke HashMap
        map.put("satu", 1);
        System.out.println(map);

        // 3. Get value dari HashMap berdasarkan key
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("apple", 5);
        System.out.println(map2.get("apple"));

        // 4. Check apakah HashMap contains key tertentu
        Map<String, String> map3 = new HashMap<>();
        map3.put("name", "John");
        System.out.println(map3.containsKey("name"));

        // 5. Check apakah HashMap contains value tertentu
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("age", 25);
        System.out.println(map4.containsValue(25));

    }
}
