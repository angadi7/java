package LinearSearch7b;



public class LinearSearch7b {

    public static void main(String[] args) {

        int[] array = {5, 12, 55, 1, 13, 45};// Example array

        int search = 13;// Element to search for

        int index = searchElement(array, search);

        

        System.out.println("Element " + search + " found at index " + index);

    }



    public static int searchElement(int[] arr, int search) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {

                return  i;

            }// Return index if search is found

        }

        return -1; // Return -1 if search is not found

    }

}