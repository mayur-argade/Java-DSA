package com.mayur;
//two or more functions of same name can exits if parameter are differents
public class FuntionOverloading {
    public static void main(String[] args) {
        int ans = sum(12, 3, 543);
        System.out.println(ans);
        ans = sum(12 ,34);
        System.out.println(ans);
        fun1(12);
    }


    static int sum(int a, int b, int c){
        return a + b+ c;
    }


    static int sum(int a, int b){
        return a+b;
    }

    static void fun1(int a){
        System.out.println(a);
    }

    static void fun1(String name){
        System.out.println(name);
    }

}
