package ru.Voronuyk.com.CodingBat.Array1;

import java.util.Arrays;

public class Front11 {
    /*Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
     */
    public static void main(String[] args) {
        front11(new int[]{1, 2, 3}, new int[]{7, 9, 8});
        front11(new int[]{1}, new int[]{2});
        front11(new int[]{1, 7}, new int[]{});
    }
    public static int[] front11(int[] a, int[] b) {
        int[] res;
        if (a.length == 0 & b.length == 0) {
            res = new int[]{};
        }else if (a.length == 0){
            res = new int[]{b[0]};
        }else if (b.length==0){
            res = new int[]{a[0]};
        }else {
            res = new int[]{a[0],b[0]};
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}




