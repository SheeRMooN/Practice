package ru.Voronuyk.com.CodingBat.Recursion;

public class Factorial {
    /*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).


factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
     */
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
    }
    public static int factorial(int n) {
        int res =1 ;
        if (n == 0 | n == 1 )
            return res;
        res = n*factorial(n-1);
        return res;
    }
}
