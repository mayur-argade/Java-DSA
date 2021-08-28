package com.mayur;

public class BinarySearch {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 0;
        System.out.println(Search(arr, target));
    }

    static int Search(int[] arr, int target){
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

}
