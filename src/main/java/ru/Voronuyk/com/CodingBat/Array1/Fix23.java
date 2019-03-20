package ru.Voronuyk.com.CodingBat.Array1;

import java.util.Arrays;

public class Fix23 {
    /*Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.


    fix23([1, 2, 3]) → [1, 2, 0]
    fix23([2, 3, 5]) → [2, 0, 5]
    fix23([1, 2, 1]) → [1, 2, 1]
     */
    public static void main(String[] args) {
        fix23(new int[]{1, 2, 3});
        fix23(new int[]{2, 3, 5});
        fix23(new int[]{1, 2, 1});
    }
    public static int[] fix23(int[] nums) {
        int[] res;
        if (nums[0]==2 && nums[1]==3){
            res = new int[]{2,0,nums[2]};
        }else if (nums[1]==2 && nums[2]==3){
            res = new int[]{nums[0],2,0};
        }else {
            res = nums;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
