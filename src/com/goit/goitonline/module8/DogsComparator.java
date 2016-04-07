package com.goit.goitonline.module8;

import java.util.Comparator;

/**
 * Created by Grigoriy on 06.04.2016.
 */
public class DogsComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAge() - o2.getAge();
    }
}
