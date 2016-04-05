package com.goit.goitonline.module8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Grigoriy on 02.04.2016.
 */
public class Runner {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pit", 5));
        dogs.add(new Dog("Bull", 3));
        dogs.add(new Dog("Bill", 8));
        dogs.add(new Dog("Dog", 1));

        System.out.println(dogs);

        Collections.sort(dogs);

        System.out.println(dogs);



        }
    }

