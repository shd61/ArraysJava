import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!set.add(array[i])) {
                System.out.println("Duplicate found: " + array[i]);
            }
        }
    }
}
