package ru.Voronuyk.Test;

import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) {
        Sort2 sort2 = new Sort2();
        int[] aa = new int[]{5, 2, 4, 6, 1, 3, 2, 6};
        Sort2.print(sortArray(aa, 1,aa.length ));


    }

     public  static int[] sortArray(int[] array, int begin, int end) {

        if (begin < end) {
            int half = (begin + end) / 2;
            sortArray(array, begin, half);
            sortArray(array, half + 1, end);
            merge(array, begin, half, end);

        }
        return array;
    }

     public static void   merge(int[] arrayM, int beginM, int halfM, int endM) {

        for (int size = 0; size < endM-beginM ; size++) {
            for (int index = 0; index < endM-(beginM+size); index++) {
                if (arrayM[index] > arrayM[index + 1]) {
                    int a = arrayM[index + 1];
                    arrayM[index + 1] = arrayM[index];
                    arrayM[index] = a;
                }
            }
        }
    }
    public static void print(int[] array){
        System.out.println(Arrays.toString(array));
    }
}