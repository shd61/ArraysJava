import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        
        int[] originalArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 46};
        
       
        int elementToInsert = 55;
        
       
        int indexToInsert = 1; 
        
        
        int[] newArray = new int[originalArray.length + 1];
        
        
        for (int i = 0; i < indexToInsert; i++) {
            newArray[i] = originalArray[i];
        }
        
        
        newArray[indexToInsert] = elementToInsert;
        
        
        for (int i = indexToInsert; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }
        
      
        System.out.println("Original array: " + Arrays.toString(originalArray));
        
        
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
