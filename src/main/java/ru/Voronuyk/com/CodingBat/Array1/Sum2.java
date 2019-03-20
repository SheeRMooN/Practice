package ru.Voronuyk.com.CodingBat.Array1;

public class Sum2 {
    /*
Given an array of ints, return the sum of the first 2 elements in the array.
If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
*/
    public static void main(String[] args) {
        sum2(new int[]{1, 2, 3});
        sum2(new int[]{1, 1});
        sum2(new int[]{1, 1, 1, 1});
    }
    public static int sum2(int[] nums) {
        int res;
        if(nums.length == 0){
            res = 0 ;
        }else if (nums.length == 1){
            res = nums[0];
        }else {
            res = nums[1] +nums[0];
        }

        System.out.println(res);
        return res;
    }
}

