package ru.Voronuyk.Test;

public class MergeSort {

//
//
//
//
//

    int[] merge(int[] arrayL, int[] arrayR) {
        int[] arrayRes = new int[arrayL.length + arrayR.length];
        boolean end = false;
        int left = 0;
        int right = 0;
        int value = 0;
        while (!end) {


            if (value == arrayRes.length ) {
                end = true;
            } else if (left == arrayL.length) {
                arrayRes[value] = arrayR[right];
                right++;
                value++;
            } else if (right == arrayR.length) {
                arrayRes[value] = arrayL[left];
                left++;
                value++;
            } else if ((arrayL[left] <= arrayR[right])) {
                arrayRes[value] = arrayL[left];
                left++;
                value++;
            } else if ((arrayL[left] > arrayR[right])) {
                arrayRes[value] = arrayR[right];
                right++;
                value++;
            }
        }
        return arrayRes;
    }
}
