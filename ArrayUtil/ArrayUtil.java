package ArrayUtil;
public class ArrayUtil {
    public static int[] sliceArray(int[] array, int startIndex, int endIndex) {
        
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            return new int[0]; 
        }

        
        int length = endIndex - startIndex + 1;

        
        int[] slicedArray = new int[length];

        
        for (int i = 0; i < length; i++) {
            slicedArray[i] = array[startIndex + i];
        }

        return slicedArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int startIndex = 2;
        int endIndex = 4;

        int[] slicedArray = sliceArray(array, startIndex, endIndex);

        
        System.out.print("Sliced Array: ");
        for (int num : slicedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
