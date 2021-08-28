package com.mayur;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        if (order(arr)){
            System.out.println("ascending order");
            System.out.println(ascendingsearch(arr, 4));
        }else{
            System.out.println("decending order");
            System.out.println(decendingsearch(arr, 4));
        }

    }

    static boolean order(int[] arr){
        int start = arr[0];
        int end = arr[arr.length-1];

        if (start<end){
            return true; //ascending
        }else {
            return false; //descending
        }
    }

    static int ascendingsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start + (end - start)/ 2 ;

            if (target > mid ){
                start = mid +1;
            }else if (target < mid ){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

// 3   9 8 7 6 5 4 3 2 1 0

    static int decendingsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start + (end - start)/ 2 ;

            if (target > mid ){
                end = mid -1;
            }else if (target < mid ){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
