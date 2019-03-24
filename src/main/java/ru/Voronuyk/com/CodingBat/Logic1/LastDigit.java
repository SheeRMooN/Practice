package ru.Voronuyk.com.CodingBat.Logic1;

public class LastDigit {
    /*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
 Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
     */
    public static void main(String[] args) {
        lastDigit(23, 19, 13);
        lastDigit(23, 19, 12);
        lastDigit(23, 19, 3);
    }
    public static boolean lastDigit(int a, int b, int c) {
        boolean res ;
        if (a%10==b%10 | a%10==c%10 | c%10==b%10){
            res = true;
        }else res = false;
        System.out.println(res);
        return res;
    }
}
