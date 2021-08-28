package com.mayur;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       // when we do not know how many arguments we are going to give
//        fun(2,3,4,5,6,7,8,9,0);
//        multiple(1, 4,"hufhurh", "vcuygvu");
            demo(12, 123, 12,1,1,1,2,4,5);
            demo("hkusfh", "uhuh", "jhfiurh", "jhbikuhvc");
            //it can not be empty while you are doing overriding varargs
    }


    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }


    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }


    //variable arguments should be at last
    static void multiple(int a, int b, String...v){
        int sum = a + b ;
        System.out.println(sum);
        System.out.println(Arrays.toString(v));

    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
