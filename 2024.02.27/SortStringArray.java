import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] array = {"Java", "python", "php", "c#", "c", "c++"};
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
