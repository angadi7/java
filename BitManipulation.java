package bitwisealgorithm;

public class BitManipulation {
    
    // Function to count set bits in a single integer
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += (num & 1); // Check the least significant bit
            num >>= 1; // Right shift the number
        }
        return count;
    }

    // Function to count the total set bits in all integers from 1 to n
    public static int totalSetBits(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += countSetBits(i);
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Total set bits from 1 to " + n + " is: " + totalSetBits(n));
    }
}
