package com.mayur;

public class leetcode1342 {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println(reduce(14));
    }

    static int reduce( int n ){
        if(n == 0 ){
            return count;
        }
        else if( n % 2 == 0){
            count = count +1;
            return reduce(n/2);
        }
        else{
            count = count +1;
            return reduce(n-1);
        }
    }
}
