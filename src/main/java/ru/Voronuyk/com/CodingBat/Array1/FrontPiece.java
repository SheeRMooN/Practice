package ru.Voronuyk.com.CodingBat.Array1;

import java.util.Arrays;

public class FrontPiece {
    /*
Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
     */
    public static void main(String[] args) {
        frontPiece(new int[]{1, 2, 3});
        frontPiece(new int[]{1, 2});
        frontPiece(new int[]{1});
    }
    public static int[] frontPiece(int[] nums) {
        int[] res;
        int value;
        if (nums.length<2){
            res = nums ;
        }else {
            res = new int[]{nums[0],nums[1]};
        }

        System.out.println(Arrays.toString(res));
        return res;
    }
}
