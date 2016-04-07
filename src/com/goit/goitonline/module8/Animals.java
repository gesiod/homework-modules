package com.goit.goitonline.module8;

/**
 * Created by Grigoriy on 07.04.2016.
 */
public class Animals implements Comparable<Animals> {

    public String name;
    public int age;
    public String makeSound;

    @Override
    public int compareTo(Animals o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        String s = String.format ("%-10s | %-4d | %-6s\n", name, age, makeSound);
        return s;

    }
}
