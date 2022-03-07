package com.mayur;

public class reverse {
    public static void main(String[] args) {
    reverseNum(1234);
    }
    static void reverseNum(int n ){
        if (n < 10 ){
            System.out.println(n);
            return;
        }
        System.out.print(n%10);
        reverseNum(n/10);
    }
}
