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
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Dog("Pit", 5));
        animalsList.add(new Cat("Tom", 1));
        animalsList.add(new Dog("Bull", 3));
        animalsList.add(new Cat("Kuzya", 5));
        animalsList.add(new Cat("Nina", 7));
        animalsList.add(new Cat("Liza", 1));
        animalsList.add(new Dog("Pit", 5));
        animalsList.add(new Dog("Bill", 8));
        animalsList.add(new Dog("Dog", 1));

        System.out.println(animalsList);

        Collections.sort(animalsList);

        System.out.println(animalsList.toString());



        }
    }

