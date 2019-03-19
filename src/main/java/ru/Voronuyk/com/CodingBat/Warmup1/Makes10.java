package ru.Voronuyk.com.CodingBat.Warmup1;

public class Makes10 {
    /*
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true*/
    public static void main(String[] args) {
        makes10(9, 10);
        makes10(9, 9);
        makes10(1, 9);
    }

    public static boolean makes10(int a, int b) {
        boolean res;
        if (a == 10 | b == 10 | (a + b) == 10) {
            res = true;
        } else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}

