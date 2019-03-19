package ru.Voronuyk.com.CodingBat.Warmup1;

public class intMax {
    /*
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
     */
    public static void main(String[] args) {
        intMax(1, 2, 3);
        intMax(1, 3, 2);
        intMax(3, 2, 1);
    }
    public static int intMax(int a, int b, int c) {
        int res;
        if (a>b & a>c){
            res = a;
        }else if (b>a & b>c){
            res = b ;
        }else {
            res = c;
        }
        System.out.println(res);
        return res;
    }
}
