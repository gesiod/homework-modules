package com.goit.goitonline.module4ex1;

import static java.lang.Math.sqrt;

/**
 * Created by Grigoriy on 08.03.2016.
 */
public class SimpleShapesSquareCalc {


    public int areaSquare(int squareSide)
    {
         return squareSide * squareSide;
    }

    public int rectangleSquare(int rectangleSideFirst, int rectangleSideSecond)
    {
        return rectangleSideFirst*rectangleSideSecond;
    }

    public double triangleSquare(double triangleSideFirst, double triangleSideSecond, double triangleSideThird){
        double semiperimeter = (triangleSideFirst + triangleSideSecond + triangleSideThird) / 2;

        return sqrt(semiperimeter * (semiperimeter - triangleSideFirst) * (semiperimeter - triangleSideSecond) * (semiperimeter - triangleSideThird));
    }

    public double triangleSquare(double baseTriangleSide, double heightTriangle){
        return (baseTriangleSide + heightTriangle) / 2;
    }

    public double circleSquare (double radiusCircle) {
        return Math.PI * radiusCircle * radiusCircle;
    }

    /*public double circleSquare (double diameterCircle) {
        return (Math.PI * diameterCircle * diameterCircle) / 4;
    }*/


}
