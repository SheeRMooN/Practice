package ru.Voronuyk.com.CodingBat.Warmup1;

public class MissingChar {
    /*Given a non-empty string and an int n, return a new string where the char at index n has been removed. T
    he value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
     */
    public static void main(String[] args) {
        missingChar("kitten", 1 );
        missingChar("kitten", 0 );
        missingChar("kitten", 4 );

    }
    public static String missingChar(String str, int n) {
        String res ;
        res = str.substring(0,n ) + str.substring(n+1,str.length() );
        System.out.println(res);
        return res;
    }
}
