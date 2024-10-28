import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListChallenge {
    public static void main(String[] args) {
        // 1. Buat sebuah empty ArrayList bertipe String
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // 2. Inisialisasi ArrayList menggunakan Arrays.asList()
        String[] s = {"A","B","C"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(s));
        System.out.println(list1);

        // 3. Inisialisasi ArrayList menggunakan List.of()
        Integer[] i = {1,2,3};
        ArrayList<Integer> list2 = new ArrayList<>(List.of(i));
        System.out.println(list2);

        // 4. Tambahkan single element ke ArrayList
        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
        System.out.println(list3);
    }
}
