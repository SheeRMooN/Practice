package ru.Voronuyk.com.CodingBat.Warmup1;

public class NearHundred {
    /*Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.

    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false
     */
    public static void main(String[] args) {
        nearHundred(93);
        nearHundred(90);
        nearHundred(89);
        System.out.println();
        nearHundred(0);
        nearHundred(-56);
        nearHundred(250);
        nearHundred(210);
        nearHundred(150);
        nearHundred(135);
        nearHundred(191);

    }
    public static boolean nearHundred(int n) {
        boolean res;
        if ((n>=90 & n<=110) | (n>=190 & n<=210)){
            res = true;
        }else
            res = false;

        System.out.println(res);
        return res;
    }
}
