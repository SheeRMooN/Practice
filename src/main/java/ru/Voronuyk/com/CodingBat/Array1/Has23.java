package ru.Voronuyk.com.CodingBat.Array1;

public class Has23 {
    /*Given an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
     */
    public static void main(String[] args) {
        has23(new   int[]{2, 5});
        has23(new   int[]{4, 3});
        has23(new   int[]{4, 5});
    }
    public static boolean has23(int[] nums) {
        boolean res = false;
        if (nums[0] == 2 | nums[0] == 3 | nums[1] == 2 | nums[1] == 3)
            res = true;
        System.out.println(res);
        return res;
    }
}
