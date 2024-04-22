package SumArray;
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = sumArray(arr, arr.length);
        System.out.println("Sum of elements in the array: " + sum);
    }

    public static int sumArray(int[] arr, int n) {


        if (n == 0) {
            return 0; // Return 0
        }

            return sumArray(arr, n - 1) + arr[n - 1];
    }
}
