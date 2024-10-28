import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        // array literal notation
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));

        // Print element pertama dan terakhir
        int[] nums = new int[]{10, 20, 30, 40, 50};
        System.out.println("Element pertama: " + nums[0]);
        System.out.println("Element terakhir: " + nums[nums.length - 1]);

        // cek length array genap atau ganjil
        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        if(nums.length % 2 == 0) {
            System.out.println("Length genap");
        } else {
            System.out.println("Length ganjil");
        }

        // ubah semua element dalam array
        int[] nums3 = new int[4];
        for(int i = 0; i < nums3.length; i++) {
            nums3[i] = 7;
        }
        System.out.println(Arrays.toString(nums3));

        // print length array
        int[] nums4 = {1,2,3,4,5,6};
        System.out.println(nums4.length);

        // print element tengah
        int[] nums5 = {1,2,3,4,5};
        if(nums5.length % 2 == 0) {
            System.out.println(nums5[(nums5.length/2)-1]);
        } else {
            System.out.println(nums5[((nums5.length -1 )/2)]);
        }

        // buat string array
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(Arrays.toString(names));

        // cek element pertama dan terakhir
        int[] nums6 = {1,2,3,4};
        boolean cek = false;
        if(nums6[0] == nums6[nums6.length-1]) {
            cek = true;
            System.out.println(cek);
        } else {
            System.out.println(cek);
        }

        // buat boolean array
        boolean[] ceks = new boolean[3];
        System.out.println(Arrays.toString(ceks));

        // Buat method yang menerima array dan print semua element secara terbalik tanpa membuat array baru
        int[] nums7 = {1,2,3,4,5};
        reversedArray(nums7);

        // Temukan jumlah (sum) dari semua element dalam array
        int[] nums8 = {5,2,8,1,9};
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        System.out.println("");
        System.out.println(sum);

        // menghitung angka genap dalam array
        int[] nums9 = {2,5,7,8,10,13};
        int count = 0;
        for(int num: nums9){
            if(num % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        // clone array
        int[] nums10 = {1,2,3,4,5};
        int[] nums11 = nums10.clone();
        nums11[0] = 99;
        System.out.println("Array asli: " + Arrays.toString(nums10));
        System.out.println("Array hasil clone: " + Arrays.toString(nums11));

        // membuat matrix 2x3
        int[][] nums12 = new int[2][3];
        int angka = 1;
        for(int i = 0; i < nums12[0].length-1; i++) {
            for(int j = 0; j < nums12[1].length; j++) {
                nums12[i][j] = angka;
                angka++;
            }
        }
        // System.out.println(Arrays.deepToString(nums12));
        for (int i = 0; i < nums12[0].length-1; i++) {
            for (int j = 0; j < nums12[1].length; j++) {
                System.out.print(nums12[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void reversedArray(int[] nums) {
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
