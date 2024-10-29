package collectionproblemsolvingchallenge;

import java.util.*;

public class CommonFriends {
    public static void main(String[] args) {
        // Input 1
        String name1 = "Ani";
        String name2 = "Budi";
        List<String> friends1 = new ArrayList<>(List.of("Budi", "Charlie", "David", "Eve"));
        List<String> friends2 = new ArrayList<>(List.of("Charlie", "David", "Frank", "Grace"));
        findFriends(friends1, friends2, name1, name2);

        // Input 2
        String name3 = "Citra";
        String name4 = "Diana";
        List<String> friends3 = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        List<String> friends4 = new ArrayList<>(List.of("David", "Eve", "Frank"));
        findFriends(friends3, friends4, name3, name4);

        // Input 3
        String name5 = "Emil";
        String name6 = "Fani";
        List<String> friends5 = new ArrayList<>(List.of("Andy", "Bob", "Charlie"));
        List<String> friends6 = new ArrayList<>(List.of("Andy", "Bob", "Charlie"));
        findFriends(friends5, friends6, name5, name6);

        // Input 4
        String name7 = "Gina";
        String name8 = "Hani";
        List<String> friends7 = new ArrayList<>(List.of("Alice", "Bob"));
        List<String> friends8 = new ArrayList<>(List.of("Bob", "Charlie", "Alice", "David"));
        findFriends(friends7, friends8, name7, name8);
    }
    public static void findFriends(List<String> friends1, List<String> friends2, String name1, String name2) {
        Set<String> friendsSet = new HashSet<>(friends1);
        List<String> mutualFriends = new ArrayList<>();
        List<String> uniqueFriends1 = new ArrayList<>();
        List<String> uniqueFriends2 = new ArrayList<>();

        for(String friend : friends2) {
            if(!friendsSet.add(friend)) {
                mutualFriends.add(friend);
            } else{
                uniqueFriends2.add(friend);
            }
        }

        for(String friend : friendsSet) {
            if(!friends2.contains(friend)) {
                uniqueFriends1.add(friend);
            }
        }
        Collections.sort(mutualFriends);
        Collections.sort(uniqueFriends1);
        Collections.sort(uniqueFriends2);

        System.out.println(mutualFriends);
        System.out.println(uniqueFriends1);
        System.out.println(uniqueFriends2);
    }
}
