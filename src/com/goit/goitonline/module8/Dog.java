package com.goit.goitonline.module8;

/**
 * Created by Grigoriy on 02.04.2016.
 */
public class Dog implements  Comparable<Dog>{
    private String name;
    private int age;

    public Dog (String name, int age) {
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name-" + name + '\'' +
                ", age-" + age +
                        '}';
    }

    @Override
    public int compareTo(Dog o) {
        return this.age - o.age;
    }
}
