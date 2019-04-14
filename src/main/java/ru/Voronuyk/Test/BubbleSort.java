package ru.Voronuyk.Test;

public class BubbleSort {

    // Сортировка пузырем
//
    // O(n*n)

    int[] bubble (int[] array){

        for (int i = 1 ; i<array.length ; i++){
            for (int j = 0 ; j<array.length-i; j++){
                if (array[j]>array[j+1]){
                    int t = array[j];
                    array[j] =array[j+1];
                    array[j+1] = t;
                }
            }
        }

        return array;
    }
}
