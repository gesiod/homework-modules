package com.goit.goitonline.module5ex1;

/**
 * Created by Grigoriy on 14.03.2016.
 */
public class MinMaxInIntArray {

    public int getMinIntArrayIndex(int[] ia) {
        int indexOfMinArray = 0;
        int minIA = ia[0];

        for (int i = 1; i < ia.length; i++ ) {
            if (minIA > ia[i]) {
                indexOfMinArray = i;
                minIA = ia[i];
            }
        }
        return indexOfMinArray;

    }

    public int getMaxIntArrayIndex (int[] ia) {
        int indexOfMaxArray = 0;
        int maxIA = ia[0];

        for (int i=1; i < ia.length; i++) {
            if (maxIA < ia[i]) {
                indexOfMaxArray = i;
                maxIA = ia[i];
            }
        }
        return indexOfMaxArray;
    }
}
