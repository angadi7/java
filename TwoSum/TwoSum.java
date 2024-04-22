package TwoSum;

import java.util.Arrays; 

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = {5, 7, 11, 15}; 

        System.out.println("Original values: " + Arrays.toString(a));

        System.out.println("Target value:");

        int targetSum = sc.nextInt(); 

        int i, j;

        boolean found = false;



        for (i = 0; i < a.length - 1; i++) {

            for (j = i + 1; j < a.length; j++) { 

                int sum = a[i] + a[j]; 
                if (targetSum == sum) { 

                	

                	 System.out.println("Pair: " + a[i] + " + " + a[j]); 
                	 

                    System.out.println("Target value is: " + targetSum); 
                  

                    found = true; 

                    break; 

                }

            }



            }  

        

        if (!found) { 

            System.out.println("No pair found that sums up to the target value."); 

        }

    }

}
