import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};
        
       
        System.out.println("Original array: " + Arrays.toString(array));
        
        
        reverseArray(array);
        
        
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
    
    
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            
            start++;
            end--;
        }
    }
}
