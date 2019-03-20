package ru.Voronuyk.com.CodingBat.Warmup1;

public class LastDigit {
    /*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
     */
    public static void main(String[] args) {
        lastDigit(7, 17);
        lastDigit(6, 17);
        lastDigit(3, 113);
    }
    public static boolean lastDigit(int a, int b) {
        boolean res = true;
        res = a%10 == b%10;
        System.out.println(res);
        return res;
    }
}
