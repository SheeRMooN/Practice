package ru.Voronuyk.com.CodingBat.Logic1;

public class Less20 {
    /*
Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
So for example 38 and 39 return true, but 40 returns false.


less20(18) → true
less20(19) → true
less20(20) → false
     */
    public static void main(String[] args) {
        less20(18);
        less20(19);
        less20(20);
    }
    public static boolean less20(int n) {
        boolean res ;
        if (n>=18 && (n%20 == 18 | n%20 == 19)){
            res = true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
