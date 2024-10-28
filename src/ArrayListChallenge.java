import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListChallenge {
    public static void main(String[] args) {
        // 1. Buat sebuah empty ArrayList bertipe String
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // 2. Inisialisasi ArrayList menggunakan Arrays.asList()
        String[] s = {"A","B","C"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(s));
        System.out.println(list1);


    }
}
