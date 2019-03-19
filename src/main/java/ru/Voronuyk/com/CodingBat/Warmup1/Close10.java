package ru.Voronuyk.com.CodingBat.Warmup1;

public class Close10 {
    /*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
 Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
     */
    public static void main(String[] args) {
        close10(8, 13);
        close10(13, 8);
        close10(13, 7);
    }

    public static int close10(int a, int b) {
        int res;
        int avalue = Math.abs(a - 10);
        int bvalue = Math.abs(b - 10);
        if (avalue == bvalue) {
            res = 0;
        } else if (avalue < bvalue) {
            res = a;
        } else
            res = b;
        System.out.println(res);
        return res;
    }
}
