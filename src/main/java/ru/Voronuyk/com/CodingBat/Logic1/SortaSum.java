package ru.Voronuyk.com.CodingBat.Logic1;

public class SortaSum {
    /*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
     */
    public static void main(String[] args) {
        sortaSum(3, 4);
        sortaSum(9, 4);
        sortaSum(10, 11);
    }
    public static int sortaSum(int a, int b) {
        int res;
        if (a+b>=10 & a+b<=19 ){
            res = 20;
        }else{
            res = a + b;
        }
        System.out.println(res);
        return res;
    }
}
