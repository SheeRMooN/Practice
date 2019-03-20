package ru.Voronuyk.com.CodingBat.Warmup1;

public class EndUp {
    /*Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
     */
    public static void main(String[] args) {
        endUp("Hello");
        endUp("hi there");
        endUp("hi");

    }
    public static String endUp(String str) {
        String res = "";
        if (str.length()<3){
            res = str.toUpperCase();
        }else {
            res = str.substring(0,str.length()-3 ) + str.substring(str.length()-3,str.length() ).toUpperCase();
        }

        System.out.println(res);
        return res;
    }
}
