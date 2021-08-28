package com.mayur;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
	//    Q:take input of two numbers and print the sum
    //using function/method
    //    sum();
        System.out.println(sum2(12 ,23));
    }
    static int sum2(int a, int b){
        int ans= a + b;
        return ans;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number 1: ");
        int num1= in.nextInt();
        System.out.print("enter a number 2: ");
        int num2= in.nextInt();

        int sum = num1+num2;

        System.out.println(sum);

    }
}
