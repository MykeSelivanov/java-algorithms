package tasks.easy;

// TODo Given an array of positive integers representing the values of coins in your possession, write a function
//  that returns the minimum amount of change(the minimum sum of money) that you cannot create.
//  if you're given no coins, the minimum amount of change that you cannot create is 1
//  Input: coins[1,2,5] Output: 4
//  Input: coins[5,7,1,1,2,3,22] Output: 20

import java.util.Arrays;

public class NonConstructableChange {
    public static void main(String[] args) {

        int [] test1 = {5, 7, 1, 1, 2, 3, 22};
        int [] test2 = {1, 1, 1, 1, 1};
        int [] test3 = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        int [] test4 = {6, 4, 5, 1, 1, 8, 9};
        int [] test5 = {};

        System.out.println(nonConstructableChange(test1));


    }

    public static int nonConstructableChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
        int change = 0;
        //[1,1,2,3,5,7,22]
        for (int i: coins){
            if(i > change + 1) {
                return change + 1;
            }
            change += i;
        }
        return change + 1;
    }

}

