package com.goit.goitonline.module5ex1;

/**
 * Created by Grigoriy on 14.03.2016.
 */

// Переименовать класс  MinMaxInIntArray в GetMinOrMaxElementsInIntegerArray
public class GetMinOrMaxElementsInIntegerArray {
    // Переименовать метод в getMinElementsInIntegerArray
    public int getMinElementsInIntegerArray(int[] ia) {
        int minIA = ia[0];
        for (int i = 1; i < ia.length; i++ ) {
            if (minIA > ia[i]) {
                minIA = ia[i];
            }
        }
        return minIA;

    }
    // Переименовать метод в getMaxElementsInIntegerArray
    public int getMaxElementsInIntegerArray (int[] ia) {
        
        int maxIA = ia[0];
        for (int i=1; i < ia.length; i++) {
            if (maxIA < ia[i]) {
                maxIA = ia[i];
            }
        }
        return maxIA;
    }

    public static void main(String[] args) {
        GetMinOrMaxElementsInIntegerArray minMaxInIntArray = new GetMinOrMaxElementsInIntegerArray();
        int[] numbers1 = {-3,7,1,23,220,-46};
        System.out.println(minMaxInIntArray.getMaxElementsInIntegerArray(numbers1));
        System.out.println(minMaxInIntArray.getMinElementsInIntegerArray(numbers1));
    }
}
