import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setChallenge {
    public static void main(String[] args) {
        // 1. Hapus Duplicate Dari ArrayList
        List<Integer> numbers = new ArrayList<>(List.of(1,2,2,3,3,4,5,5));
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);

    }
}
