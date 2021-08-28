package com.mayur;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till he does not press X or x


        int ans = 0;
        while(true){

            System.out.print("enter a operation: ");
            char ch = in.next().trim().charAt(0);


            if (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%')
            {
                System.out.print("enter two numbers: ");
                int num1= in.nextInt();
                int num2= in.nextInt();

                if (ch=='+'){
                    ans = num1 +num2;
                }
                if (ch=='-'){
                    ans = num1 - num2;
                }
                if (ch=='*'){
                    ans = num1 * num2;
                }
                if (ch=='/'){
                    ans = num1 / num2;
                }
                if (ch=='%'){
                    ans = num1 % num2;
                }
                System.out.println(ans);
            }
            else if (ch=='x' || ch == 'X' ) {
                System.out.println("THANKYOU");
                break;
            }
            else{
                System.out.println("invalid responce");
            }
        }
    }
}
