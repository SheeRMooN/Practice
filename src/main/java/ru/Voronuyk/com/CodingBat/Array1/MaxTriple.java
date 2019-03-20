package ru.Voronuyk.com.CodingBat.Array1;

public class MaxTriple {
    /*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
     The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
     */
    public static void main(String[] args) {
        maxTriple(new int[]{1, 2, 3});
        maxTriple(new int[]{1, 5, 3});
        maxTriple(new int[]{5, 2, 3});
    }
    public static int maxTriple(int[] nums) {
        int res ;
        int begin = nums[0];
        int end = nums[nums.length-1];
        int mid = nums[nums.length/2];
        if (begin>=end & begin>=mid){
            res = begin;
        }else if(end>=begin & end>=mid){
            res = end;
        }else {
            res = mid;
        }
        System.out.println(res);
        return res;
    }
}
