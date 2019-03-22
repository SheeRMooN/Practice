package ru.Voronuyk.com.CodingBat.Logic1;

public class More20 {
    /*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod


more20(20) → false
more20(21) → true
more20(22) → true
     */
    public static void main(String[] args) {
        more20(20);
        more20(21);
        more20(22);
    }
    public static boolean more20(int n) {
        boolean res ;
        if (n%20 == 2 | n%20 == 1){
            res = true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
