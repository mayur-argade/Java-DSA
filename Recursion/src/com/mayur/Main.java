package com.mayur;

public class Main {

    public static void main(String[] args) {
        num(0);
    }
    static void num(int num){
        if(num>=5){
            return ;
        }
        System.out.println(num);
        num(num+1);
    }
}
