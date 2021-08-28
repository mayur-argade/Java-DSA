package com.mayur;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        syntax
    /*
    ArrayList<WrapperClasses> name = new ArrayList<>();
            wrapper classes
            int--> Integer
            float--> Float
            long--> Long
    */
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i=0; i<5; i++)
        {
            list.add(in.nextInt());
        }
//        get item at any index

        for (int i=0; i<5; i++)
        {
            System.out.println(list.get(i));    //at place of i you have to pass index.
        }
        System.out.println(list);
    }
}
