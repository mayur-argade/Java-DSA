package com.mayur;

import java.util.Scanner;

public class neloops {

    public static void main(String[] args) {

//        for(int i = 0; i<=5; i++)
//        {
//            System.out.println(i);
//        }
//        System.out.println("enter a number");
//        Scanner input = new Scanner(System.in);
//        int n= input.nextInt();
//
//        for (int i=0; i<=n; i++)
//        {
//            System.out.println(i);
//        }
//
//        /*
//            syntax for while loop
//            while(){
//                //body
//            }
//        */
//        Scanner input= new Scanner(System.in);
//        int i = 0;
//        int num = input.nextInt();
//
//        while (i<=num)
//        {
//            System.out.println(i);
//            i++;
//        }
//
        /*
            syntax for do while loop [once it will always exicute]
            do{
                this
            }while(condition);
         */
        int i=0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        do {
            System.out.println(i);
            i++;
        }while (i<=num);
    }
}
