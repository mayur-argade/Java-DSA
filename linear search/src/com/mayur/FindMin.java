package com.mayur;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6 };
//        int start = 4;
//        int end = 5;
        System.out.println(min(arr,3, 5 ));
    }

    static int min(int[] arr, int start, int end){
        int min = arr[start];
        for (int i=start; i<=end; i++ )
        {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
