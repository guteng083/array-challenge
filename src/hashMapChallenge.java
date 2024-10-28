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
    }
}
