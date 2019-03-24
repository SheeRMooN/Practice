package ru.Voronuyk.com.CodingBat.Logic1;

public class LessBy10 {
    /*
    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
     */
    public static void main(String[] args) {
        lessBy10(1, 7, 11);
        lessBy10(1, 7, 10);
        lessBy10(11, 1, 7);
    }
    public static boolean lessBy10(int a, int b, int c) {
        boolean res ;
        if (a>=b+10 | a>=c+10 | b>=a+10 | b>=c+10 | c>=a+10 | c>=b+10){
            res = true;
        }else  res = false;
        System.out.println(res);
        return res;
    }
}
