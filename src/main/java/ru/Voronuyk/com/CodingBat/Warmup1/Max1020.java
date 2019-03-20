package ru.Voronuyk.com.CodingBat.Warmup1;

public class Max1020 {
    /*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
     */
    public static void main(String[] args) {
        max1020(11, 19);
        max1020(19, 11);
        max1020(11, 9);
    }

    public static int max1020(int a, int b) {
        int res = 0;
        if ((a >= 10 & a <= 20) & (b >= 10 & b <= 20)) {
            res = (a >= b) ? a : b;
        } else if (b >= 10 & b <= 20) {
            res = b;
        } else if (a >= 10 & a <= 20) {
            res = a;
        } else {
            res = 0;
        }
        System.out.println(res);
        return res;
    }
}
