package SliceArray;
import java.util.Arrays;

public class SliceArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int startIndex = 2;
        int endIndex = 7;

        int[] slicedArray = sliceArray(array, startIndex, endIndex);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Sliced Array: " + Arrays.toString(slicedArray));
    }

    
    public static int[] sliceArray(int[] array, int startIndex, int endIndex) {
        
        int length = endIndex - startIndex + 1;
        
        int[] slicedArray = new int[length];

        
        for (int i = 0; i < length; i++) {
            slicedArray[i] = array[startIndex + i];
        }

        return slicedArray;
    }
}
