package ru.Voronuyk.com.CodingBat.Array1;

import java.util.Arrays;

public class MakeLast {
    /*
Given an int array, return a new array with double the length where its last element is the same as the original array,
and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
     */
    public static void main(String[] args) {
        makeLast(new int[]{4, 5, 6});
        makeLast(new int[]{1, 2});
        makeLast(new int[]{3});
    }
    public static int[] makeLast(int[] nums) {
        int[] res;
        if (nums.length == 1){
            res = new int[]{0,nums[0]};
        }else {
            res = new int[(nums.length*2)];
            for (int i=0 ; i<(nums.length*2)-1 ; i++){
                res[i]=0;
            }
            res[res.length-1]=nums[nums.length-1];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
