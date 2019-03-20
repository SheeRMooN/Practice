package ru.Voronuyk.com.CodingBat.Warmup1;

public class EveryNth {
    /*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
 So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
     */
    public static void main(String[] args) {
        everyNth("Miracle", 2);
        everyNth("abcdefg", 2);
        everyNth("abcdefg", 3);
    }
    public static String everyNth(String str, int n) {
        String res = str.substring(0,1 );
        for (int i = 1 ; i<=(int)((str.length()-1)/n) ; i++){
            res = res + str.substring(n*i,(n*i)+1);
        }
        System.out.println(res);
        return res;
    }
}
