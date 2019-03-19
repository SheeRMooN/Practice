package ru.Voronuyk.com.CodingBat.Warmup1;

public class StartHi {
    /*Given a string, return true if the string starts with "hi" and false otherwise.

    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
     */
    public static void main(String[] args) {
        startHi("hi there");
        startHi("hi");
        startHi("hello hi");
    }
    public static boolean startHi(String str) {
        boolean res;

        if (str.length()>1 & str.substring(0,2 ).equals("hi")){
            res = true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
