import java.util.*;

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

        // 10. Get value dengan default value jika key tidak ada
        Map<String, Integer> map9 = new HashMap<>();
        map9.put("count", 5);
        System.out.println(map9.getOrDefault("total", 0));

        // 11. Print semua keys dari HashMap
        Map<String, Object> map10 = new HashMap<>();
        map10.put("nama", "Budi");
        map10.put("usia", 20);
        System.out.println(map10);
        List<String> keys = new ArrayList<>(map10.keySet());
        Collections.sort(keys);
        for(String key : keys) {
            System.out.println(key);
        }

        // 12. Print semua values dari HashMap
        Map<String, Integer> score = new HashMap<>();
        score.put("math", 80);
        score.put("science", 85);
        List<Integer> keys2 = new ArrayList<>(score.values());
        Collections.sort(keys2);
        for(Integer key : keys2) {
            System.out.println(key);
        }

        // 13. Put multiple entries sekaligus ke HashMap
        Map<String, Integer> map11 = new HashMap<>();
        String[] mapKey = {"satu", "dua", "tiga"};
        Integer[] mapValue = {1,2,3};
        for(int i = 0; i < mapKey.length; i++) {
            map11.put(mapKey[i], mapValue[i]);
        }
        System.out.println(map11);

        // 14. Copy semua entries dari satu HashMap ke HashMap lain
        Map<String, Integer> map12 = new HashMap<>();
        Map<String, Integer> map13 = new HashMap<>();
        map12.put("A", 1);
        map12.put("B", 2);
        map13.putAll(map12);
        System.out.println(map13);

        // 15. Print key dan value berpasangan
        Map<String, Object> map14 = new HashMap<>();
        map14.put("nama", "Ani");
        map14.put("nilai", 90);
        for(String key : map14.keySet()) {
            System.out.println("Key: " + key + "," + " Value: " + map14.get(key));
        }
    }
}
