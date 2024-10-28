package collectionproblemsolvingchallenge;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String input1 = "saya suka makan nasi saya suka makan ayam";
        String input2 = "kucing kucing kucing";
        String input3 = "A B C B A A";
        Map<String, Integer> map = countWords(input1);
        Map<String, Integer> map2 = countWords(input2);
        Map<String, Integer> map3 = countWords(input3);

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }

        List<String> keys2 = new ArrayList<>(map2.keySet());
        Collections.sort(keys2);
        for (String key : keys2) {
            System.out.println(key + ": " + map2.get(key));
        }

        List<String> keys3 = new ArrayList<>(map3.keySet());
        Collections.sort(keys3);
        for (String key : keys3) {
            System.out.println(key + ": " + map3.get(key));
        }

    }
    public static Map<String, Integer> countWords(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}
