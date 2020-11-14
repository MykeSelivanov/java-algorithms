package tasks;

import utils.ArrayGenerator;

import java.util.Arrays;

//TODO
// Reverse order of an array of unordered integers

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseSortArray(ArrayGenerator.getRandomIntArray(5, 10))));
    }

    public static int [] reverseSortArray(int [] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

}
