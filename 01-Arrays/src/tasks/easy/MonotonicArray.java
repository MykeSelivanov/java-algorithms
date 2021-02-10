package tasks.easy;

// TODO An array is monotonic if it is either monotone increasing or monotone decreasing.
//  An arrayAis monotone increasing if for alli <= j,A[i] <= A[j].
//  An arrayAis monotone decreasing if for alli <= j,A[i] >= A[j].
//  Write a method that returns true if and only if the given arrayAis monotonic.
//  Example 1: Input: [1,2,2,3] Output: true
//  Example 2: Input: [1,3,2] Output: false

public class MonotonicArray {
    public static void main(String[] args) {
        int [] monotoneArray = {1,1,2,2,3,4,5,6,7};
        int [] nonMonotoneArray = {1,3,2,5,0};
        int [] equalInts = {-1,-1,-1};

        System.out.println(isMonotonic(equalInts));

    }

    public static boolean isMonotonic(int [] arr) {
        boolean isMonotonic = true;
        boolean increasingTrend = true;
        int j = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] < arr[i+1]) {
                increasingTrend = true;
                j = i + 1;
                break;
            }
            if (arr[i] > arr[i+1]) {
                increasingTrend = false;
                j = i + 1;
                break;
            }
        }
        if (increasingTrend){
            for(int i = j; i < arr.length - 1; i++){
                if (arr[i] > arr[i+1]) isMonotonic = false;
            }
        } else {
            for(int i = j; i < arr.length - 1; i++){
                if (arr[i] < arr[i+1]) isMonotonic = false;
            }
        }
        return isMonotonic;
    }

}
