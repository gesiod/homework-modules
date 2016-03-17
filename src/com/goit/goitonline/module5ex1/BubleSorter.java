package com.goit.goitonline.module5ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Grigoriy on 16.03.2016.
 */
public class BubleSorter {



    public List<Integer> sort (List<Integer> integers) {
        //List<Integer> returnIntegers = new ArrayList<Integer>();
        //returnIntegers = integers;
        if(integers.size() <= 1) return integers;
        for(int i =0; i < integers.size(); i++) {
            if (i != integers.size()-1) {
                if (integers.get(i) > integers.get(i+1)) {
                   int temp = integers.get(i + 1);
                   integers.set(i+1, integers.get(i));
                   integers.set(i, temp);
               }
            }
        }
        sort(integers.subList(0, integers.size() - 1));

        return integers;

    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,4,5,3,9,5,12,44,34,60,7,45,77,23,88,1095,12);
        BubleSorter bubleSorter = new BubleSorter();
        List<Integer> sorterIntegers = bubleSorter.sort(integers);
        System.out.print(sorterIntegers);


    }
}

