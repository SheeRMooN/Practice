package ru.Voronuyk.com.CodingBat.Warmup1;

public class In3050 {
    /*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
     */
    public static void main(String[] args) {
        in3050(30, 31);
        in3050(30, 41);
        in3050(40, 50);
    }
    public static boolean in3050(int a, int b) {
        boolean res ;
        if ((a>=30 & a<=40) &(b>=30 & b<=40) ){
            res = true;
        }else if ((a>=40 & a<=50) &(b>=40 & b<=50) ){
            res = true;
        }else{
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
