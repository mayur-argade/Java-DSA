package com.mayur;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        switch (empID) {
            case 1 -> System.out.println("mayur argade");
            case 2 -> System.out.println("Ketan argade");
            case 3 -> {
                String department = in.next();
                switch (department) {
                    case "a" -> System.out.println("it department");
                    case "b" -> System.out.println("computer department");
                    default -> System.out.println("unemployed");
                }
            }
            default -> System.out.println("no employee");
        }


    }
}
