package ru.Voronuyk.com.CodingBat.Warmup1;

public class Or35 {
    /*
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    Use the % "mod" operator -- see Introduction to Mod

    or35(3) → true
    or35(10) → true
    or35(8) → false
     */
    public static void main(String[] args) {
        or35(3);
        or35(10);
        or35(8);
    }
    public static boolean or35(int n) {
        boolean res;
        if (n>0 & (n%3==0 | n%5==0)){
            res = true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
