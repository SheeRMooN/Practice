package ru.Voronuyk.com.CodingBat.Array1;

import java.util.Arrays;

public class MidThree {
    /*Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
     The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
     */
    public static void main(String[] args) {
        midThree(new int[]{1, 2, 3, 4, 5});
        midThree(new int[]{8, 6, 7, 5, 3, 0, 9});
        midThree(new int[]{1, 2, 3});
    }
    public static int[] midThree(int[] nums) {
        int[] res = new int[3];
        int value;
        for (int i =0 ; i<3 ; i++){
            res[i] = nums[nums.length/2-1+i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
