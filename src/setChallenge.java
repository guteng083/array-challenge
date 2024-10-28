import java.util.*;

public class setChallenge {
    public static void main(String[] args) {
        // 1. Hapus Duplicate Dari ArrayList
        List<Integer> numbers = new ArrayList<>(List.of(1,2,2,3,3,4,5,5));
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);

        // 2. Check Nama Duplikat
        List<String> names = new ArrayList<>(List.of("Budi", "Ani", "Budi", "Cindy"));
        Set<String> uniqueNames = new HashSet<>(names);
        if(uniqueNames.size() != names.size()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // 3. Gabung Dua List Tanpa Duplikat
        List<String> list1 = new ArrayList<>(List.of("A", "B", "C"));
        List<String> list2 = new ArrayList<>(List.of("B", "C", "D"));
        Set<String> set1 = new HashSet<>();
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println(set1);

        // 4. Temukan Nama Duplikat
        List<String> mahasiswa = new ArrayList<>(List.of("Ani", "Budi", "Ani", "Cindy", "Budi", "Dodi"));
        Set<String> mahasiswaSet = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for(String s : mahasiswa){
            if(!mahasiswaSet.contains(s)){
                mahasiswaSet.add(s);
            } else {
                set2.add(s);
            }
        }
        System.out.println(set2);
    }
}
