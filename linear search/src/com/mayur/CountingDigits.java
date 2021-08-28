package com.mayur;

//return number
public class CountingDigits {
    public static void main(String[] args) {
        int[] arr = {12, -12, 343, 0, 4564};
        System.out.println(count(arr));
    }

    static int count(int[] arr){
        int count=0;
    for (int i=0; i< arr.length; i++){
        if(digits(arr[i])){
            count++;
        }

    }
        return count;
    }


    static boolean digits(int num){
        int count = 0;
        if(num==0){
            return false;
        }
        if (num<0){
            num =num * -1;
        }
        while(num>0){
            count++;
            num=num/10;
        }
        if (count%2==0){
            return true;
        }else {
            return false;
        }
    }


}
