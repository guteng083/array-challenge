import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }
}
