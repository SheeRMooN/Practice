package ru.Voronuyk.com.CodingBat.Array1;

public class SameFirstLast {
    /*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
     */
    public static void main(String[] args) {
        sameFirstLast(new int[] {1, 2, 3});
        sameFirstLast(new int[]{1, 2, 3, 1});
        sameFirstLast(new int[]{1, 2, 1});
    }
    public static boolean sameFirstLast(int[] nums) {
        boolean res;

       if (nums.length>0 && (nums[0] == nums[nums.length-1])){
           res = true;
       }else {
           res  = false;
       }
        System.out.println(res);
        return res;
    }
}
