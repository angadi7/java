package BruteForceSort7a;
import java.util.Random;

public class BruteForceSort7a {
    
    public static void main(String[] args) {
        
        int[] arr = initializeArray(10, 0, 100);
        
        
        System.out.println("Unsorted array:");
        printArray(arr);
        
        
        BruteForceSort(arr);
        
        
        System.out.println("\nSorted array:");
        printArray(arr);
    }
    
    public static void BruteForceSort(int[] arr) {
        
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static int[] initializeArray(int size, int minVal, int maxVal) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(maxVal - minVal + 1) + minVal;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
