package ru.Voronuyk.com.CodingBat.Array1;

public class Double23 {
    /*Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
     */
    public static void main(String[] args) {
        double23(new int[]{2, 2});
        double23(new int[]{3, 3});
        double23(new int[]{2, 3});
    }
    public static boolean double23(int[] nums) {
        boolean res = false;
        if (nums.length < 2){
            res = false;
        }else if ((nums[0] ==2 & nums[1] == 2) | (nums[0]==3 & nums[1]==3)){
            res= true;
        }
        System.out.println(res);
        return res;
    }
}
