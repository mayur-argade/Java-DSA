package com.mayur;

import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        boolean ans =searching2(arr, 8);
        System.out.println(ans);
//        search in the arrays: returns the index if item found
//        otherwise if item not found return -1
    }

    static boolean searching2(int[] arr, int num){
        for(int i = 0; i<arr.length; i++ )
        {
            if (arr[i]==num){
                return true;
            }

        }
        return false;
    }

    static int searching(int[] arr, int num){
        for(int i = 0; i<arr.length; i++ )
        {
            if (arr[i]==num){
                return i;
            }

        }
        return -1;
    }
}
