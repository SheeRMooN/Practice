package ru.Voronuyk.com.CodingBat.Logic1;

public class Old35 {
    /*Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod


old35(3) → true
old35(10) → true
old35(15) → false
     */
    public static void main(String[] args) {
        old35(3);
        old35(10);
        old35(15);
    }
    public static boolean old35(int n) {
        boolean res  ;
        if (n%5 == 0 ^ n%3 == 0){
            res = true;
        }else {
            res =false;
        }
        System.out.println(res);
        return res;
    }
}
