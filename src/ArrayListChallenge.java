import java.util.*;

public class ArrayListChallenge {
    public static void main(String[] args) {
        // 1. Buat sebuah empty ArrayList bertipe String
        List<String> list = new ArrayList<>();
        System.out.println(list);

        // 2. Inisialisasi ArrayList menggunakan Arrays.asList()
        String[] s = {"A","B","C"};
        List<String> list1 = new ArrayList<>(Arrays.asList(s));
        System.out.println(list1);

        // 3. Inisialisasi ArrayList menggunakan List.of()
        Integer[] i = {1,2,3};
        List<Integer> list2 = new ArrayList<>(List.of(i));
        System.out.println(list2);

        // 4. Tambahkan single element ke ArrayList
        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
        System.out.println(list3);

        // 5. Print size dari ArrayList
        List<String> list4 = Arrays.asList("X", "Y", "Z");
        System.out.println(list4.size());

        // 6. Periksa apakah ArrayList memiliki element tertentu
        List<String> list5 = List.of("Red", "Blue");
        System.out.println(list5.contains("Red"));

        // 7. Inisialisasi ArrayList dengan capacity awal
        List<String> list6 = new ArrayList<>(20);

        // 8. Tambahkan element di index tertentu
        List<String> list7 = new ArrayList<>(List.of("A", "C"));
        list7.add(1, "B");
        System.out.println(list7);

        // 9. Hapus element dari ArrayList
        List<String> list8 = new ArrayList<>(List.of("A", "B", "C"));
        list8.remove("B");
        System.out.println(list8);

        // 10. Ambil element dari index tertentu
        List<String> list9 = new ArrayList<>(List.of("X", "Y", "Z"));
        System.out.println(list9.get(1));

        // 11. Urutkan ArrayList menggunakan Collections.sort()
        List<String> names = new ArrayList<>();
        String[] n = {"Charlie", "Alice", "Bob"};
        names.addAll(List.of(n));
        Collections.sort(names);
        System.out.println(names);

        // 12. Balik urutan ArrayList menggunakan Collections.reverse()
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        Collections.reverse(numbers);
        System.out.println(numbers);

        // 13. Cari nilai maximum dan minimum dalam ArrayList menggunakan Collections min or max methods
        List<Integer> scores = Arrays.asList(85,90,75,95,80);
        int max = Collections.max(scores);
        int min = Collections.min(scores);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
}
