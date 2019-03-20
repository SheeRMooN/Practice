package ru.Voronuyk.com.CodingBat.Array1;

public class No23 {
    /*
Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
     */
    public static void main(String[] args) {
        no23(new int[]{4, 5});
        no23(new int[]{4, 2});
        no23(new int[]{3, 5});
    }
    public static boolean no23(int[] nums) {
        boolean res ;
        res = (nums[0] == 2 | nums[0] == 3 | nums[1] == 2 | nums[1] == 3) ? false : true ;
        System.out.println(res);
        return res;
    }
}
