package com.mayur;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int[] list = {1,2,3,4,5};
        System.out.println(Arrays.toString(list));

        swap(list, 1, 4 );

        System.out.println(Arrays.toString(list));
    }
    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
