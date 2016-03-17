package com.goit.goitonline.module5ex1;

/**
 * Created by Grigoriy on 14.03.2016.
 */
public class MinMaxInIntArray {

    public int getMinIntArrayElement(int[] ia) {
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

    public int getMaxIntArrayElement (int[] ia) {
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
        int[] numbers1 = {5,7,5,23,20,46};
        System.out.println(minMaxInIntArray.getMaxIntArrayElement(numbers1));
        System.out.println(minMaxInIntArray.getMinIntArrayElement(numbers1));
    }
}
