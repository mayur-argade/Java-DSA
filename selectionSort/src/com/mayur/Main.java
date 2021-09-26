package com.mayur;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //finding maximum element and swapping it with the last index
//            finding max elements index
            int last = arr.length - i -1;
            int max = maximum(arr, 0, last);
            swap(arr, max, last);

        }
    }

    static int maximum(int[] arr, int start, int end) {
    int maxindex=0;
    for(int i=0; i<=end; i++)
    {
        if(arr[i]>arr[maxindex]){
            maxindex=i;
        }
    }

        return maxindex;
    }


    static void swap(int[] arr, int maxindex, int lastindex){
        int temp = arr[maxindex];
        arr[maxindex]= arr[lastindex];
        arr[lastindex]= temp;
    }
}
