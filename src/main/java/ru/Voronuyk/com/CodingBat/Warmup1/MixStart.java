package ru.Voronuyk.com.CodingBat.Warmup1;

public class MixStart {
    /*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
     */
    public static void main(String[] args) {
        mixStart("mix snacks");
        mixStart("pix snacks");
        mixStart("piz snacks");
    }
    public static boolean mixStart(String str) {
        boolean res;
        if (str.length()>=3 && str.substring(1,3 ).equals("ix")){
            res = true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
