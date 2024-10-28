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

        // 14. Buat program untuk menyimpan daftar nilai:
        List<Integer> scores2 = Arrays.asList(75,80,85,90,70);
        for(int f = 0; f < scores2.size();f++){
            for(int g = f + 1; g < scores2.size();g++){
                if(scores2.get(f)>scores2.get(g)){
                    int temp = scores2.get(f);
                    int temp1 = scores2.get(g);
                    scores2.set(f, temp1);
                    scores2.set(g, temp);
                }

            }
        }
        Collections.reverse(scores2);
        System.out.println("Nilai Diurutkan: " + scores2);
        System.out.print("Tiga nilai tertinggi: ");
        int sum = 0;
        for(int x = 0; x < scores2.size();x++){
            if(x < 2){
                System.out.print(scores2.get(x) + ", ");
            } else if(x == 2){
                System.out.print(scores2.get(x));
            }
            sum += scores2.get(x);
        }
        System.out.println("");
        double mean = sum / scores2.size();
        System.out.println("Rata-rata nilai: " + mean);

        // 15. Buat program untuk mengelola daftar nama:
        List<String> names2 = new ArrayList<>(List.of("Budi", "Ani", "Cindy", "Dodi"));
        System.out.println("List awal: " + names2);
        names2.add(0, "Eko");
        System.out.println("Setelah tambah Eko: " + names2);
        Collections.sort(names2);
        System.out.println("Setelah diurutkan: " + names2);
        System.out.print("Nama dengan awalan A atau B: ");
        for(String name: names2){
            if(name.startsWith("A") || name.startsWith("B")){
                System.out.print(name + " ");
            }
        }
    }
}
