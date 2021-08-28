package com.mayur;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = prime(num);
        System.out.println(ans);
    }


    static boolean prime (int num){

        int count = 0;
        if (num==1){
      System.out.println("neither prime nor composite");
       return false; }
  else
  {
      int i = 2;

      while (i<num){
          if (num%i==0){
              return false;
          }
          i++;
      }
  }
    return true;}
}
