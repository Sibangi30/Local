import java.util.Arrays;

public class Insertion {

   
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        
        for (int i = 1; i < n; i++) {
            int key = array[i]; 
            int j = i - 1;

            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
           
            array[j + 1] = key;
        }
    }

   
    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6};
        
        System.out.println("Original Array: " + Arrays.toString(data));
        
        insertionSort(data);
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
