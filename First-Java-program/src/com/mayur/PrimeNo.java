package com.mayur;

import java.util.Scanner;

public class PrimeNo
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner (System.in);
       int n = in.nextInt();
       int check = 0;
       int i = 2;

       if (n==1)
       {
           System.out.println("it is neither prime nor composite");
           return;
       }else {
           while (i < n) {
               if (n % i == 0) {
                   check = check + 1;
               }
               i++;
           }
       }
       if (check == 0 )
       {
           System.out.println(" It is a prime number ");

       }else
       {
           System.out.println("It is not a prime number ");
       }
    }
}
