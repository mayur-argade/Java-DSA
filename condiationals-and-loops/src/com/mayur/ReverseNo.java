package com.mayur;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = in.nextInt();
        int i = 0;
        while(n>0) {
            int remainder = n % 10;
            System.out.print(remainder);
            n = n / 10;
            i++;
        }

    }
}
