package tasks.easy;

// TODO
//  Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.
//  A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that are in the
//  same order as they appear in the array. For instance, the numbers [1,3,4] form a subsequence of the array [1,2,3,4]
//  and so do the numbers [2,4].
//  Note that a single number in an array and the array itself are both valid subsequences of the array.
//  Input: array = [5,1,22,25,6,-1,8,10], sequence = [1,6,-1,10]
//  Output: true

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence1 = Arrays.asList(1, 6, -1, 10);

        List<Integer> list2 = Arrays.asList(1, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence2 = Arrays.asList(1, 1, 22, 25, 6, -1, 8, 10);

        List<Integer> list3 = Arrays.asList(1,2,3);
        List<Integer> sequence3 = Arrays.asList(0,0,0,0,0);

        System.out.println(isValidSubsequence(list3,sequence3));

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIdx = 0;
        int sequenceIdx = 0;

        while (arrayIdx < array.size() && sequenceIdx < sequence.size()){
            if (array.get(arrayIdx) == sequence.get(sequenceIdx)) {
                sequenceIdx++;
            }
            arrayIdx++;
        }

        if (sequenceIdx == sequence.size()){
            return true;
        }
        return false;
    }

}
