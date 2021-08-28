package com.mayur;


//everyone block and function nd loop and there own scope you cannot use variable outside it
public class Shadowing {
  static int x = 10; //this will be shadowed at line x ' scope will begin when value is initialised
  public static void main(String[] args) {
//    practice of using two variable with same name within the scope that overlap
      System.out.println(x);
      int x = 90;
      System.out.println(x);
      fun();
    }


    static void fun(){
        System.out.println(x);
    }
}
