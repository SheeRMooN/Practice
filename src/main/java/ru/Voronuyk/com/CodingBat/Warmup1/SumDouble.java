package ru.Voronuyk.com.CodingBat.Warmup1;

public class SumDouble {
    /*
    * Given two int values, return their sum. Unless the two values are the same, then return double their sum.


    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
    */
    public static void main(String[] args) {
        sumDouble(1,2 );
        sumDouble(3,2 );
        sumDouble(2,2 );
    }
    public static int sumDouble(int a, int b) {
        int c ;
        if (a == b) {
            c = (a + b)*2;
        }else
            c = (a+b);
        System.out.println(c);
        return c;
    }
}
