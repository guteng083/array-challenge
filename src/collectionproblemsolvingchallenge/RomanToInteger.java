package collectionproblemsolvingchallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        int num1 = romanToInt("III");
        int num2 = romanToInt("IV");
        int num3 = romanToInt("IX");
        int num4 = romanToInt("LVIII");
        int num5 = romanToInt("MCMXCIV");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int sum = 0;
        boolean skip = false;
        String[] romans = s.split("");

        for(int i = 0; i < romans.length; i++) {
            if(skip){
                skip = false;
                continue;
            }
            if(i == romans.length-1){
                sum += map.get(romans[i]);
                skip = false;
                continue;
            }
            if((map.get(romans[i]) >= map.get(romans[i+1]))) {
                sum += map.get(romans[i]);
                skip = false;
            }else {
                sum += map.get(romans[i+1]) - map.get(romans[i]);
                skip = true;
            }
        }

        return sum;
    }
}
