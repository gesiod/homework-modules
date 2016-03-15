package com.goit.goitonline.module4ex1;

import java.awt.geom.Point2D;

import static java.lang.StrictMath.sqrt;

/**
 * Created by Grigoriy on 10.03.2016.
 */
public class Distance2Points {
    public double calculateDistance2P (Point2D firstPoint, Point2D secondPoint) {
        return sqrt (Math.pow(secondPoint.getX() - firstPoint.getX(), 2) + Math.pow(secondPoint.getY() - firstPoint.getY(), 2));
    }

    public double calculateDistance2P (double firstPointX, double firstPointY, double secondPointX, double secondPointY) {
        return sqrt (Math.pow(secondPointX - firstPointX, 2) + Math.pow(secondPointY - firstPointY, 2));
    }
}
