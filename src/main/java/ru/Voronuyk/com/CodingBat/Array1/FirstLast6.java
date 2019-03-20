package ru.Voronuyk.com.CodingBat.Array1;

public class FirstLast6 {
    /*Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
     */
    public static void main(String[] args) {
        firstLast6(new int[]{1, 2, 6});
        firstLast6(new int[]{6, 1, 2, 3});
        firstLast6(new int[]{13, 6, 1, 2, 3});
    }
    public static boolean firstLast6(int[] nums) {
        boolean res;
        if (nums[0] == 6){
            res =true;
        }else if (nums[nums.length-1] == 6){
            res = true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
