package ru.Voronuyk.com.CodingBat.Array1;

import java.util.Arrays;

public class MaxEnd3 {
    /*
Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
    public static void main(String[] args) {
        maxEnd3(new int[]{1, 2, 3});
        maxEnd3(new int[]{11, 5, 9});
        maxEnd3(new int[]{2, 11, 3});
    }

    public static int[] maxEnd3(int[] nums) {
        int[] res;
        int value;
        if (nums[0] >= nums[2]) {
            value = nums[0];
        } else {
            value = nums[2];
        }

        res = new int[]{value, value,value};
        System.out.println(Arrays.toString(res));
        return res;
    }
}
