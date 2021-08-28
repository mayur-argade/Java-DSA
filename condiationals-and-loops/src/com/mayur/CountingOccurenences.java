package com.mayur;

import java.util.Scanner;

public class CountingOccurenences {
    public static void main(String[] args) {
        //i will give you number then you have to tell me how many times it is in that number
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        long n = in.nextLong();
        System.out.println("enter a number you want to check: ");
        int b = in.nextInt();
        int count =0;
        for (int i= 0; i<=n; i++)
        {
            long remainder=n%10;
            if(remainder==b){
                count++;
            }
            n = n/10;
        }
        System.out.println(count + " times it has occured");
    }
}
