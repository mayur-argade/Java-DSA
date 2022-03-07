package com.mayur;

public class countZero {
    static int countN = 0;
    public static void main(String[] args) {
        System.out.println(count(30204));
    }
    static int count(int n ){
        if (n == 0) {
            return countN ;
        }
        else if (n %10 == 0){
            countN = countN + 1 ;
        }
        return  count(n/10);
    }


}
