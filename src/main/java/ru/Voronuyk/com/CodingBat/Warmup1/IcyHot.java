package ru.Voronuyk.com.CodingBat.Warmup1;

public class IcyHot {
    /*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
     */
    public static void main(String[] args) {
        icyHot(120, -1);
        icyHot(-1, 120) ;
        icyHot(2, 120) ;
    }
    public static boolean icyHot(int temp1, int temp2) {
        boolean res ;
        if (temp1>100 & temp2<0){
            res = true;
        }else if (temp1<0 & temp2>100){
            res = true;
        }else {
            res = false;
        }

        System.out.println(res);
        return res;
    }
}
