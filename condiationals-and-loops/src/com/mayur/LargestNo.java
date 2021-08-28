package com.mayur;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//      Q : find the largest no. from given three numbers
        if (a>b)
        {
            if (a>c)
            {
                System.out.println("the greater number is" + a);
            }else
            {
                System.out.println("the greater number is "+ c);
            }
        }
        else
        {
            if (b>c)
            {
                System.out.println("the greater number is " + b);
            }
            else{
                System.out.println("the greater number is " + c);
            }
        }
    }
}
