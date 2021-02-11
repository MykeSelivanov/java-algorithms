package tasks.easy;

// TODO Given an array of integers between 1 and n, inclusive, where n is the length of the array,
//  write a method that returns the first integer that appears more than once (when the array is read from left to right).
//  In other words, out of all the integers that might occur more than once in the input array,
//  your function should return the one whose first duplicate value has the minimum index.
//  If no integer appears more than once, your function should return -1.
//  Note that you're allowed to mutate the input array.
//  Example 1: Input:array = [1,3,4,2,2] Output:2
//  Example 2: Input:array = [3,1,3,4,2] Output:3

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicate {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,5};
        int [] arr2 = {3,4,2,1,3,-3};
        int [] arr3 = {1,1};
        int [] arr4 = {1,2,3,4};

        System.out.println(firstNonDupe(arr4));

    }

    public static int firstNonDupe(int [] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i: arr){
            if (!set.add(i)) return i;
        }
        return -1;
    }
}
