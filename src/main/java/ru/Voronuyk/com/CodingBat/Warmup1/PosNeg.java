package ru.Voronuyk.com.CodingBat.Warmup1;

public class PosNeg {
    /*Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true
     */
    public static void main(String[] args) {
        posNeg(1,-1 ,false );
        posNeg(-1,1 , false);
        posNeg(-4,-5,true );
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        boolean res;
        if (negative == true) {
            if (a < 0 & b < 0) {
                res = true;
            } else {
                res = false;
            }
        } else if ((a < 0 & b > 0) | (a > 0 & b < 0)) {
            res = true;
        } else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
