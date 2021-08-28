package com.mayur;

import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        taking an array input
        int[] array = new int[5];
        for (int i=0; i< 5; i++){
            array[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(array));  // looking at sample array output

        System.out.println(max(array));
    }

    static int max(int[] arr){
        int max = arr[0];
        int i = 0;

        while(i<5){
            if (max<arr[i]){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
}
