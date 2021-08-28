package com.mayur;

public class typecasting {
    public static void main(String[] args) {
        byte b = 42;
        int i = 50000;
        char c = 'a' ;
        float f = 345.5f;
        double d = 0.1234;
        short s = 1024;
        double result = (f * b) + (i / c) +  ( d-s );
        System.out.println((f * b) + " " + (i / c) +   " " + ( d*s ));
        System.out.println(result);

        //	1) All the bytes, short, characters are promoting to integers.
        // 2)If any one of the operands is long, float, double then entire operation will promote to those.
    }
}
