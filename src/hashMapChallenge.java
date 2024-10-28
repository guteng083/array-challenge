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

        // 6. Remove entry dari HashMap berdasarkan key
        Map<String, Integer> map5 = new HashMap<>();
        map5.put("A", 1);
        map5.put("B", 2);
        map5.remove("A");
        System.out.println(map5);

        // 7. Print size dari HashMap
        Map<String, Integer> map6 = new HashMap<>();
        map6.put("x", 1);
        map6.put("y", 2);
        map6.put("z", 3);
        System.out.println(map6.size());

        // 8. Check apakah HashMap kosong
        Map<String, Integer> map7 = new HashMap<>();
        System.out.println(map7.isEmpty());

        // 9. Clear semua entries dalam HashMap
        Map<String, Integer> map8 = new HashMap<>();
        map8.put("a", 1);
        map8.put("b", 2);
        map8.clear();
        System.out.println(map8);
    }
}
