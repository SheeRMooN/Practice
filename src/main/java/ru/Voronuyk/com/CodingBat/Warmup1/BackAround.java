package ru.Voronuyk.com.CodingBat.Warmup1;

public class BackAround {
    /*Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt". The original string will be length 1 or more.


    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"
     */
    public static void main(String[] args) {
        backAround("cat");
        backAround("Hello");
        backAround("a");
    }
    public static String backAround(String str) {
        String res ;
        String lostChar = String.valueOf(str.charAt(str.length()-1));
        res = lostChar+ str.substring(0, str.length()) + lostChar;
        System.out.println(res);
        return res;
    }
}
