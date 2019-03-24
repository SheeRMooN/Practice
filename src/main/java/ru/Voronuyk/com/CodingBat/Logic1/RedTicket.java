package ru.Voronuyk.com.CodingBat.Logic1;

public class RedTicket {
    /*
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
If they are all the value 2, the result is 10. Otherwise if they are all the same,
the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.


redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
     */
    public static void main(String[] args) {
        redTicket(2, 2, 2);
        redTicket(2, 2, 1);
        redTicket(0, 0, 0);
    }
    public static int redTicket(int a, int b, int c) {
        int res;
        if ( a == b & b == c){
            res = a==2 ? 10 : 5;
        }else if (c != a & b != a){
            res = 1;
        }else res = 0;
        System.out.println(res);
        return res;
    }
}
