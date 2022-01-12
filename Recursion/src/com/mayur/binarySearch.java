package com.mayur;

public class binarySearch {
    public static void main(String[] args) {
    int[] arr= {0, 1, 2, 3, 4, 5, 6};
    int target = 0;
    int s = 0;
    int e = 5;
        System.out.println(binary(arr,target,s, e));
    }

    static int binary(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e - s) / 2 ;
        if (arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return binary (arr, target, s, mid-1);
        }
        return binary(arr, target, mid+1,e );

    }
}
