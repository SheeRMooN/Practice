package ru.Voronuyk.com.CodingBat.Array1;

public class CommonEnd {
    /*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
 Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
     */
    public static void main(String[] args) {

        commonEnd(new int[]{1, 2, 3},new int[]{7, 3});
        commonEnd(new int[]{1, 2, 3},new int[]{7, 3, 2});
        commonEnd(new int[]{2, 1, 3},new int[]{1, 3});
    }
    public static boolean commonEnd(int[] a, int[] b) {
        boolean res = false;
        if (a[0] == b[0]){
            res =true;
        }else if (a[a.length-1] == b[b.length-1]){
            res= true;
        }else {
            res=false;
        }
        System.out.println(res);
        return res;
    }
}
