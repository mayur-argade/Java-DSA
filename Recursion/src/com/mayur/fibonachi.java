package com.mayur;
import java.util.Scanner;

//find the nth fibonacchi numberl

public class fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();

        System.out.println(fibo(n));
    }
    static int fibo(int n){
//        base condintion
        if (n< 2 ){
            return n;
        }
        return fibo(n-1 ) + fibo(n-2);
    }
}
