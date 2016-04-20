package com.goit.goitonline.module4ex1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by GRSV on 20.04.2016.
 */
public class SimpleShapesSquareCalcTest extends TestCase {

    @Test
    public void testAreaSquare() throws Exception {
        SimpleShapesSquareCalc simpleShapesSquareCalc = new SimpleShapesSquareCalc();
        double areaSide = 44;
        assertEquals(areaSide * areaSide, simpleShapesSquareCalc.areaSquare(areaSide));

    }

    @Test
    public void testRectangleSquare() throws Exception {
        SimpleShapesSquareCalc simpleShapesSquareCalc = new SimpleShapesSquareCalc();
        double rectSideFirts = 35;
        double rectSideSecond = 50;
        assertEquals(rectSideFirts * rectSideSecond, simpleShapesSquareCalc.rectangleSquare(rectSideFirts, rectSideSecond));

    }

    @Test
    public void testTriangleSquareBase() throws Exception {
        SimpleShapesSquareCalc simpleShapesSquareCalc = new SimpleShapesSquareCalc();

        double baseTriangleSide = 12;
        double heightTriangle = 7;
        double result = 42;

        assertEquals(result, simpleShapesSquareCalc.triangleSquare(baseTriangleSide, heightTriangle));

    }

    @Test
    public void testTriangleSquareSides() throws Exception {
        SimpleShapesSquareCalc simpleShapesSquareCalc = new SimpleShapesSquareCalc();
        double triangleSideFirst = 30;
        double triangleSideSecond = 40;
        double triangleSideThird = 50;
        double result = 600;
        assertEquals(result, simpleShapesSquareCalc.triangleSquare(triangleSideFirst, triangleSideSecond, triangleSideThird));

    }

    @Test
    public void testCircleSquare() throws Exception {
        SimpleShapesSquareCalc simpleShapesSquareCalc = new SimpleShapesSquareCalc();
        double radiusCircle = 99;
        double result = 30790.749597833563530172367799522;
        assertEquals(result, simpleShapesSquareCalc.circleSquare(radiusCircle));

        }

    }
