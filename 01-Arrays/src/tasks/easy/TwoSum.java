package tasks.easy;

// TODO Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
//  to target.You may assume that each input would have exactly one solution, and you may not use
//  the same element twice. You can return the answer in any order.
//  Example 1: Input:nums = [2,7,11,15], target = 9 Output:[0,1]
//  Example 2: Input:nums = [3,2,4], target = 6O utput:[1,2]

import java.util.Arrays;
import java.util.NoSuchElementException;

public class TwoSum {
    public static void main(String[] args) {

        int [] test1 = {1,2,3,4,5,6,7};
        int target1 = 10;
        int [] test2 = {10, 5 ,6, 3, -3, 0};
        int target2 = 7;
        int [] test3 = {1,1,1,1};
        int target3 = 3;

        System.out.println(Arrays.toString(indicesForSum(test2, target2)));


    }

    public static int [] indicesForSum(int [] arr, int target){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] + arr[j] == target) return new int [] {i,j};
            }
        }
        throw new NoSuchElementException("No elements to sum up to target!");
    }

}
