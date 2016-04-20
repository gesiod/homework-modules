package com.goit.goitonline.module4ex1;

import junit.framework.TestCase;
import org.junit.Test;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by GRSV on 20.04.2016.
 */
public class Distance2PointsTest extends TestCase {

    @Test (timeout = 30)
    public void testCalculateDistance2P() throws Exception {
        Distance2Points distance2Points = new Distance2Points();
        Point2D point1 = new Point2D.Double(5,5);
        Point2D point2 = new Point2D.Double(12,8);
        assertEquals(point1.distance(point2), distance2Points.calculateDistance2P(point1,point2));
    }

    @Test (timeout = 30)
    public void testCalculateDistance2P1() throws Exception {
        Distance2Points distance2Points = new Distance2Points();
        int firsPointX = -7;

        int firsPointY = -7;

        int secendPointX = 66;

        int secendPointY = 68;

        assertEquals(Point2D.distance(firsPointX, firsPointY, secendPointX, secendPointY), distance2Points.calculateDistance2P(firsPointX, firsPointY, secendPointX, secendPointY));


    }

}
