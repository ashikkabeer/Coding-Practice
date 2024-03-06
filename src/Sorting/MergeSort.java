package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second) {
        int[] result= new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
            k++;
        }
        // there is a possiblity that size are different
        while(i<first.length) {
            result[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length) {
            result[k] = first[j];
            j++;
            k++;
        }
        return result;
    }

}
