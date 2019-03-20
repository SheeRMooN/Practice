package ru.Voronuyk.com.CodingBat.Array1;

public class Start1 {
    /*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
     */
    public static void main(String[] args) {
        start1(new int[]{1, 2, 3}, new int[]{1, 3});
        start1(new int[]{7, 2, 3}, new int[]{1});
        start1(new int[]{1, 2}, new int[]{});
    }

    public static int start1(int[] a, int[] b) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                res += 1;
            }
        }

        for (int j = 0; j < b.length; j++) {
            if (b[j] == 1) {
                res += 1;
            }
        }
        System.out.println(res);
        return res;
    }
}
