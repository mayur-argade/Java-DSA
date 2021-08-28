package com.mayur;

import java.util.Scanner;
//both of conditions need to be true then you can use and
//only one condition needs to be true then you can use or

public class AlphabetCasesCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("lowercase");
        }else
        {
            System.out.println("uppercase");
        }
    }
}
