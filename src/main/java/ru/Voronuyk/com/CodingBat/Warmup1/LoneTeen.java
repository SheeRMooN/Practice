package ru.Voronuyk.com.CodingBat.Warmup1;

public class LoneTeen {
    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
     */
    public static void main(String[] args) {
        loneTeen(13, 99);
        loneTeen(21, 19);
        loneTeen(13, 13);
    }
    public static boolean loneTeen(int a, int b) {
        boolean res ;
        if ((b>=13 & b<=19) ^ (a>=13 & a<=19)){
            res = true;
        }else {
            res = false;
        }

        System.out.println(res);
        return res;
    }
}
