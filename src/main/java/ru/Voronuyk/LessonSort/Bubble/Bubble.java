package ru.Voronuyk.LessonSort.Bubble;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arry = new int[10];


        for (int i = 0; i < arry.length; i++)
            arry[i] = (int) (Math.random() * 99);

        System.out.println(Arrays.toString(arry));
        System.out.println("----------------------------------------");

        for (int size = 0; size < arry.length ; size++) {
            for (int index = 0; index < arry.length-(size+1); index++) {
                if (arry[index] > arry[index + 1]) {
                    int a = arry[index + 1];
                    arry[index + 1] = arry[index];
                    arry[index] = a;
                }

            }
            System.out.println(Arrays.toString(arry));
        }


    }
}
