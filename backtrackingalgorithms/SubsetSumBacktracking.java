package com.backtrackingalgorithms;

import java.util.*;
public class SubsetSumBacktracking {
	 // Function to find all subsets of the given set that sum up to the target
    static void findSubsets(int[] set, int target) {
        Arrays.sort(set);  // Optional: Sorting helps in pruning the search space
        List<Integer> currentSubset = new ArrayList<>();
        findSubsetsHelper(set, target, 0, currentSubset);
    }
 
    // Helper function for the backtracking approach
    static void findSubsetsHelper(int[] set, int target, int index, List<Integer> currentSubset) {
        if (target == 0) {
            // If the target is achieved, print the current subset
            System.out.println(currentSubset);
            return;
        }
 
        for (int i = index; i < set.length; i++) {
            // Skip if the current element is greater than the remaining target
            if (set[i] > target) {
                break;
            }
 
            // Include the current element in the subset
            currentSubset.add(set[i]);
 
            // Recurse with the reduced target and next index
            findSubsetsHelper(set, target - set[i], i + 1, currentSubset);
 
            // Backtrack: remove the last added element and try the next element
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
 
    public static void main(String[] args) {
        int[] set = {10,20,30,40};
        int target = 50;
        System.out.println("Subsets with sum " + target + ":");
        findSubsets(set, target);
    }
}
