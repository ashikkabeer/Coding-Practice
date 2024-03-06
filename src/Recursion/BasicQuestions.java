package Recursion;

import java.util.Arrays;

public class BasicQuestions {
    public static void main(String[] args) {
        // System.out.println(stringLen("hello world"));
        int[] arr = {9,8,7,6,5,4,3,2,1};
        bubble(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //Recursive Bubble Sort
    private static void bubble(int[] arr, int n) {
        if(n==1) {
            return;
        }
        int count = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count = count+1;
            }

        // Check if any recursion happens or not
        // If any recursion is not happen then return
        if (count == 0)
            return;

        // Largest element is fixed,
        // recur for remaining array
        bubble(arr, n-1);
    }


    //finding the length of a string using recursion
    private static int stringLen(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return stringLen(s.substring(1))+1;
    }
}
