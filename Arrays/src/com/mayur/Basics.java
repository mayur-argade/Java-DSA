package com.mayur;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] rnos = new int[5];
//        int[] rosn2 = {23, 43, 56, 67, 78};
//        System.out.println(rosn2);
//
//        System.out.println("enter a size of an array");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//
//        //input using for loop
//        System.out.println("enter array elements");
//        for( int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
////      output of an array using for loop
//        for( int i = 0; i<arr.length; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
//        // when you pass an array from an to string method it converts an array into sting and prints it
//        System.out.println(Arrays.toString(arr));
//
//        //enhanced for loop (for each loop)
//        for (int num: arr)
//        {
//            System.out.println(num+ " "); //here num represent elements of an array
//        }
//
////        array of an objects

        String[] str = new String[5];
        for(int i = 0; i< str.length; i++)
        {
            str[i] = in.next();
        }
//        modufy
        str[0] = "mayur argade";
        System.out.println(Arrays.toString(str));

    }
}
