package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = getMaxIndex(arr, 0, i + 1); // Update the range
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        int bigIndex = -1;
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                bigIndex = i;
                max = arr[i];
            }
        }
        return bigIndex;
    }

}
