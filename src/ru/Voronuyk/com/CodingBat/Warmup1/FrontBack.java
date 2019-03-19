package ru.Voronuyk.com.CodingBat.Warmup1;

public class FrontBack {
    /*Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public static void main(String[] args) {
        frontBack("code");
        frontBack("a");
        frontBack("ab");

    }
    public static String frontBack(String str) {
        String res ;
        if (str.length() <2){
            res = str ;
        }else {
            res = str.substring(str.length()-1, str.length()) + str.substring(1,str.length()-1) + str.substring(0,1 );
        }
        System.out.println(res);
        return res;
    }
}
