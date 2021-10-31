package com.mayur;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr = {4, 5, 3, 2, 1};
        code(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void code(int[] arr){
        for (int i = 0; i <=arr.length-2 ; i++) {
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }

    }
    static void swap(int[] arr, int second, int previous){
        int temp= arr[second];
        arr[second]=arr[previous];
        arr[previous]=temp;

    }
}
