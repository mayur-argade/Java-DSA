package com.mayur;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String fruit = in.next();
	//search .equals and == difference
//        if(fruit.equals("mango")){
//            System.out.println("king of fruit");
//        }     not nice

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            case "grapes":
                System.out.println("a small fruit");
                break;
            default:
                System.out.println("give a valid fruit");
                break;
        }
        int days = in.nextInt();
        switch (days){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("tuesday");
            case 3-> System.out.println("wednesday");
            case 4-> System.out.println("thursday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("saturday");
            case 7-> System.out.println("sunday");

        }

    }
}
