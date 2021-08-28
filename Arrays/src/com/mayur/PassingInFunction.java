package com.mayur;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] num = new int[5];
        num = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(num));
        System.out.println("after function call");
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr){
        arr[1]= 32;
    }
}
