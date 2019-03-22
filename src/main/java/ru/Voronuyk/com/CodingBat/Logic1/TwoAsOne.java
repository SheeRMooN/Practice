package ru.Voronuyk.com.CodingBat.Logic1;

public class TwoAsOne {
    /*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
     */
    public static void main(String[] args) {
        twoAsOne(1, 2, 3);
        twoAsOne(3, 1, 2);
        twoAsOne(3, 2, 2);
    }
    public static boolean twoAsOne(int a, int b, int c) {
        boolean res;
        if (a == b+c | b == a+c | c == a+b){
            res=true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
