package utils;

import java.util.Random;

public class ArrayGenerator {

    public static int[] getRandomIntArray(int size, int intLimit){
        int [] arr = new int [size];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(intLimit);
        }
        return arr;
    }

    public static int[][] get2DIncrementingIntArray(int rows, int columns, int startValue){
        int [][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                arr[i][j] = startValue;
                startValue++;
            }
        }
        return arr;
    }

    public static void print2DArrayAsMatrix (int [][] arr) {
        for (int [] innerArray: arr) {
            for (int num: innerArray){
                System.out.printf("%4d",num);
            }
            System.out.println();
        }
    }
}

