package ru.Voronuyk.com.CodingBat.Logic1;

public class SpecialEleven {
    /*
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod


specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
     */
    public static void main(String[] args) {
        specialEleven(22);
        specialEleven(23);
        specialEleven(24);
    }
    public static boolean specialEleven(int n) {
        boolean res;
        if (n%11 == 0 | n%11 == 1 ){
            res = true;
        }else {
            res =   false;
        }
        System.out.println(res);
        return res;
    }
}
