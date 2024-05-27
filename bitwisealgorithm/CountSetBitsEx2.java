package bitwisealgorithm;

public class CountSetBitsEx2 {
	// Function to count the number of set bits in a number
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // step1: We have to find a bitwise_and with 1
            n >>= 1; // step2:  We have to right shift with 1
        }
        return count;
    }
//
    public static void main(String[] args) {
        int num = 53;
        System.out.println("Number of set bits in " + num + " is " + countSetBits(num));
    }
}
