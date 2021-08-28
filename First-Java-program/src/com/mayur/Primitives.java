package com.mayur;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = 64;    //4bytes
        char grade ='A';
        float marks = 98.57F;
        double largeDecimalNo = 45678.64321;
        long largeInt = 3456789L;
        boolean check = true;
        String name = "Mayur"; //string is not primitive

        System.out.println(rollno+" "+ grade +" "+ marks+" "+largeDecimalNo+ " " +largeInt+" "+name);

        String name2 = input.nextLine();// will give you whole line
        System.out.println(name2);
        String name3 = input.next();//will give you 1st string of string
        System.out.println(name3);

    }
}

