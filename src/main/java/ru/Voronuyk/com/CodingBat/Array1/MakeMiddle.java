package ru.Voronuyk.com.CodingBat.Array1;

import java.util.Arrays;

public class MakeMiddle {
    /*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
     */
    public static void main(String[] args) {
        makeMiddle(new int[]{1, 2, 3, 4});
        makeMiddle(new int[]{7, 1, 2, 3, 4, 9});
        makeMiddle(new int[]{1, 2});
    }
    public static int[] makeMiddle(int[] nums) {
        int[] res;
        if (nums.length <3){
            res = nums;
        }else{
            res = new int[]{nums[(nums.length/2)-1],nums[nums.length/2]};
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
