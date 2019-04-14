package ru.Voronuyk.Test;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int [] arrayB = new int[10];
        for (int i =0 ; i<arrayB.length ; i++){
            arrayB[i]= (int)(Math.random()*99);
        }
        System.out.println(Arrays.toString(arrayB));

        int [] arrayI = new int[10];
        for (int i =0 ; i<arrayI.length ; i++){
            arrayI[i]= (int)(Math.random()*99);
        }
        System.out.println(Arrays.toString(arrayI));
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Bubble sort = "+Arrays.toString(bubbleSort.bubble(arrayB)));

        InserSort insertSort = new InserSort();
        System.out.println("Insert sort = "+Arrays.toString(insertSort.insert(arrayI)));

        MergeSort mergeSort = new MergeSort();
        System.out.println("Merge sort = "+Arrays.toString(mergeSort.merge(arrayB,arrayI )));
    }
}
