package SimpleCalculator;

public class SimpleCalculator {

    public static void main(String[] args) {
        int numOne = 5;
        int numTwo = 10;
        add(numOne, numTwo);
        subtract(numOne, numTwo);
        multiply(numOne, numTwo);
        divide(numOne, numTwo);
    }

    public static void add(int numOne, int numTwo) {
        int result = numOne + numTwo;
        System.out.println("The addition is: " + numOne + " + " + numTwo + " = " + result);
    }

    public static void subtract(int numOne, int numTwo) {
        int result = numOne - numTwo;
        System.out.println("The subtraction is: " + numOne + " - " + numTwo + " = " + result);
    }

    public static void multiply(int numOne, int numTwo) {
        int result = numOne * numTwo;
        System.out.println("The multiplication is: " + numOne + " * " + numTwo + " = " + result);
    }

    public static void divide(int numOne, int numTwo) {
        int result = numOne / numTwo;
        System.out.println("The division is: " + numOne + " / " + numTwo + " = " + result);
    }
}