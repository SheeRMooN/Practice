package ru.Voronuyk.Test;

public class InserSort {

    // Сортировка вставкой
    //
    // O(n*n) худший случай
    // O(n) лучший случай
    // O(n*n) средний случай

    int[] insert(int[] array){

        for (int i = 1; i<array.length; i++){
            for (int j = i ; j>0; j--){
                if (array[j-1]>array[j]){
                    int t = array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }

        return array;
    }
}
