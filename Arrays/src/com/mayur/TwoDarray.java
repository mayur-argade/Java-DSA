package com.mayur;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(Arrays.deepToString(arr));


//    input of an array
        int i = 3;
        int j = 2;
        int[][] arr2d = new int[i][j];  //declarisation of array
//        taking input using for loop
//        first we will take input for an row and in that we will take input for an column
        for (int row = 0; row<arr2d.length; row++){
            for (int col= 0; col<arr2d[row].length; col++){
                arr2d[row][col] = in.nextInt();
            }
        }
//        printing an array
        /*for (int row = 0; row<i; row++){
            System.out.println(Arrays.toString(arr2d[row]));

        }*/

//        for (int row = 0; row<arr2d.length; row++){
//            for (int col= 0; col<arr2d[row].length; col++){
//                System.out.print(arr2d[row][col] + " ");
//            }
//            System.out.println();
//        }

        for( int[] a: arr2d){
            System.out.println(Arrays.toString(a));
        }

    }
}
