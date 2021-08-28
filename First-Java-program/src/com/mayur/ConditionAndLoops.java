package com.mayur;

public class ConditionAndLoops {
    public static void main(String[] args) {
        //syntax for if and else condition
        int a = 10;
        int b = 5;
        if(a<b)
        {
            //here is your statement
            System.out.println("helllo mayur");
        }
        else
        {
            System.out.println("not hello mayur");
        }

        //while loops
        int count = 1;
        while(count<a)
        {
            System.out.println(count);
            count++;
        }

        System.out.println("this is for loop ");
        //for loop
        for(int i = 0; i< b; i++)
        {
            System.out.println(i);
        }
    }
}
