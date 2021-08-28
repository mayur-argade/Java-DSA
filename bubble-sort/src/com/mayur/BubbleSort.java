package com.mayur;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++) {
            //for each step max item will come at last step
            swapped = false;
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] <arr[j-1] ){// swap the item smaller than previous item
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped){// if swap havent done then it is sorted and no need to loop it again
                break;
            }
        }

    }
}
