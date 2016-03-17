package com.goit.goitonline.module4ex1;

import java.awt.geom.Point2D;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

/**
 * Created by Grigoriy on 10.03.2016.
 */
public class Distance2Points {
    public double calculateDistance2P (Point2D firstPoint, Point2D secondPoint) {
        return sqrt (Math.pow(secondPoint.getX() - firstPoint.getX(), 2) + Math.pow(secondPoint.getY() - firstPoint.getY(), 2));
    }

    public static double calculateDistance2P (double firstPointX, double firstPointY, double secondPointX, double secondPointY) {

            return sqrt(Math.pow(secondPointX - firstPointX, 2) + Math.pow(secondPointY - firstPointY, 2));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты X первой точки:");
        int firsPointX = sc.nextInt();
        System.out.println("Введите координаты Y первой точки:");
        int firsPointY = sc.nextInt();
        System.out.println("Введите координаты X второй точки:");
        int secendPointX = sc.nextInt();
        System.out.println("Введите координаты Y второй точки:");
        int secendPointY = sc.nextInt();
        System.out.println("Растояние между точками равно: " + calculateDistance2P(firsPointX, firsPointY, secendPointX, secendPointY));
    }
}

