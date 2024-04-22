package ReverseOrder;
public class ReverseOrder{
    public static void main(String[] args) {
        
        int[] numbers = new int[10];

       
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        
        System.out.println("Original Array:");
        printArray(numbers);

        
        reverseArray(numbers);

        
        System.out.println("\nArray in Reverse Order:");
        printArray(numbers);
    }

   
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
}
