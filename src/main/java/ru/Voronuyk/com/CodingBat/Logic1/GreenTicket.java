package ru.Voronuyk.com.CodingBat.Logic1;

public class GreenTicket {
    /*
You have a green lottery ticket, with ints a, b, and c on it.
 If the numbers are all different from each other, the result is 0. If all of the numbers are the same,
 the result is 20. If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
     */
    public static void main(String[] args) {
        greenTicket(1, 2, 3);
        greenTicket(2, 2, 2);
        greenTicket(1, 1, 2);
    }

    public static int greenTicket(int a, int b, int c) {
        int res;
        if (a == b & a == c) {
            res = 20;
        } else if (a == b | b == c | c == a) {
            res = 10;
        } else res = 0;
        System.out.println(res);
        return res;
    }
}
