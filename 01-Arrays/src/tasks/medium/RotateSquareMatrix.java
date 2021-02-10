package tasks.medium;

//TODO
// Rotate an (n x n) matrix 90 degrees clockwise in place

import utils.ArrayGenerator;

public class RotateSquareMatrix {

    public static void main(String[] args) {
        int [][] nums = ArrayGenerator.get2DIncrementingIntArray(4,4,1);
        ArrayGenerator.print2DArrayAsMatrix(nums);

        rotateMatrix(nums);
        System.out.println();

        ArrayGenerator.print2DArrayAsMatrix(nums);

    }

    public static int [][] rotateMatrix(int [][] arr) {
        //swap rows with columns
        // 1,2,3     becomes    1,4,7
        // 4,5,6                2,5,8
        // 7,8,9                3,6,9
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //swap columns till the middle
        // 1,4,7     becomes    7,4,1
        // 2,5,8                8,5,2
        // 3,6,9                9,6,3
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length - 1 - j];
                arr[i][arr[i].length - 1 - j] = temp;
            }
        }
        return arr;
    }

}
