package com.mayur;

public class SearchInStrings {
    public static void main(String[] args) {

        String name = "mayur";
        char target = 'x';
        boolean ans = search(name, target);
        System.out.println(ans);
    }
    static boolean search(String str, char target)
    {
        for (int i=0; i<str.length(); i++)
        {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
