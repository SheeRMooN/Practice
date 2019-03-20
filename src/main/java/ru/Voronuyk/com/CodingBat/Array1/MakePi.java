package ru.Voronuyk.com.CodingBat.Array1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MakePi {
    /*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

makePi() → [3, 1, 4]
     */
    public static void main(String[] args) {
        makePi();
    }
    public static int[] makePi() {
        int[] res = new int[]{3,1,4};

        System.out.println(Arrays.toString(res));
        return res;
    }
}
