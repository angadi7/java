package SwapWithoutThirdVariable;
public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
       
        int a = 7;
        int b = 77;

        
        System.out.println("Original values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
        a = a + b;
        b = a - b;
        a = a - b;

        
        System.out.println("\nValues after swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
