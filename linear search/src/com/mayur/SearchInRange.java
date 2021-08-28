package com.mayur;

import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a starting point");
        int start = in.nextInt();
        System.out.println("enter a ending point");
        int end = in.nextInt();
        System.out.println("enter a target");
        int target = in.nextInt();

        int[] arr = {1 , 2, 3, 4, 5, 6};

        int ans = range(arr, start, end, target);
        if (ans == -1 ){
            System.out.println("error");
        }
        else{
        System.out.println("it is at index " + ans);
        }

    }
    static int range(int[] arr, int start, int end, int target){
        for (int i = start; i<=end; i++){
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
