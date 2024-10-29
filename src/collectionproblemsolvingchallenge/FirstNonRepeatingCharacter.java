package collectionproblemsolvingchallenge;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input1 = "leetcode";
        String input2 = "loveleetcode";
        String input3 = "aabb";
        String input4 = "aabbaaccddeexxzz";
        String input5 = "stress";

        System.out.println(firstUniqChar(input1));
        System.out.println(firstUniqChar(input2));
        System.out.println(firstUniqChar(input3));
        System.out.println(firstUniqChar(input4));
        System.out.println(firstUniqChar(input5));
    }

    public static int firstUniqChar(String s) {
        String[] str = s.split("");
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        for(String string: str){
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        for(int i = 0; i < str.length; i++){
            if(map.get(str[i]) == 1){
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}
