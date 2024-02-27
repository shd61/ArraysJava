import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1789, 2035, 1899, 1456, 2013, 1458};
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
