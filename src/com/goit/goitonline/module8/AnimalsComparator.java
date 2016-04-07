package com.goit.goitonline.module8;

import java.util.Comparator;

/**
 * Created by Grigoriy on 06.04.2016.
 */
public class AnimalsComparator implements Comparator<Animals> {

    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.age - o2.age;
    }
}
