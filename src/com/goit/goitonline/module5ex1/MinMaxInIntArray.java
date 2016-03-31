package com.goit.goitonline.module5ex1;

/**
 * Created by Grigoriy on 14.03.2016.
 */

// Переименовать класс  MinMaxInIntArray в GetMinOrMaxElementsInIntegerArray
public class MinMaxInIntArray {
    // Переименовать метод в getMinElementsInIntegerArray
    public int getMinIntArrayElement(int[] ia) {
        //удалить переменную indexOfMinArray, которая была нужна, когда предпологалось, что метод будет возражать не элемент, а индекс
        int indexOfMinArray = 0;
        int minIA = ia[0];

        for (int i = 1; i < ia.length; i++ ) {
            if (minIA > ia[i]) {
                indexOfMinArray = i;
                minIA = ia[i];
            }
        }
        return minIA;

    }
    // Переименовать метод в getMaxElementsInIntegerArray
    public int getMaxIntArrayElement (int[] ia) {
        //удалить переменную indexOfMinArray, которая была нужна, когда предпологалось, что метод будет возражать не элемент, а индекс
        int indexOfMaxArray = 0;
        int maxIA = ia[0];

        for (int i=1; i < ia.length; i++) {
            if (maxIA < ia[i]) {
                indexOfMaxArray = i;
                maxIA = ia[i];
            }
        }
        return maxIA;
    }

    public static void main(String[] args) {
        MinMaxInIntArray minMaxInIntArray = new MinMaxInIntArray();
        int[] numbers1 = {-3,7,1,23,220,-46};
        System.out.println(minMaxInIntArray.getMaxIntArrayElement(numbers1));
        System.out.println(minMaxInIntArray.getMinIntArrayElement(numbers1));
    }
}
