public class AverageArray {
    public static void main(String[] args) {
        
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        
    
        int sum = 0;
        
        
        for (int number : numbers) {
            sum += number;
        }
        
        
        double average = (double) sum / numbers.length;
        
        
        System.out.println("Average of the array elements: " + average);
    }
}
