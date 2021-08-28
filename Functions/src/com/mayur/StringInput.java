package com.mayur;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
        System.out.println(greet());
    }


    static String mygreet(String name) {
        String message = "hello "+ name;
        return message;
    }


    static String greet(){
        String greeting= "how are you ";
        return greeting;
    }
}
