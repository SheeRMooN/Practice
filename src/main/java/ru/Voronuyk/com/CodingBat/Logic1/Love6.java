package ru.Voronuyk.com.CodingBat.Logic1;

public class Love6 {
    /*
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
 Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.


love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
     */
    public static void main(String[] args) {
        love6(6, 4);
        love6(4, 5);
        love6(1, 5);
        System.out.println();
        love6(-7, 1);
        love6(-2,-4);
    }
    public static boolean love6(int a, int b) {
        boolean res;
        if ((b>a & (b-a)==6) | (a>b & (a-b)==6) | (a+b)==6 | a == 6 | b == 6){
            res = true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}