package ru.Voronuyk.com.CodingBat.Logic1;

public class In1To10 {
    /*
Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true,
in which case return true if the number is less or equal to 1, or greater or equal to 10.


in1To10(5, false) → true
in1To10(11, false) → false
in1To10(11, true) → true
     */
    public static void main(String[] args) {
        in1To10(5, false);
        in1To10(11, false);
        in1To10(11, true);
    }
    public static boolean in1To10(int n, boolean outsideMode) {
        boolean res;
        if (outsideMode){
            if (n >= 10 | n <=1){
                res = true;
            }else {
                res = false;
            }
        }else if (outsideMode == false){
            if (n >=1 & n<=10){
                res = true;
            }else {
                res = false;
            }
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
