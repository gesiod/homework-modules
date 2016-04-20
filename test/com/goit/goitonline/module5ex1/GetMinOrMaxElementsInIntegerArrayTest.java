package com.goit.goitonline.module5ex1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by GRSV on 20.04.2016.
 */
public class GetMinOrMaxElementsInIntegerArrayTest extends TestCase {

    @Test
    public void testGetMinElementsInIntegerArray() throws Exception {
        GetMinOrMaxElementsInIntegerArray minMaxInIntArray = new GetMinOrMaxElementsInIntegerArray();
        int[] numbersArray = {-5,70,21,23,220,-46,33};
        int result = -46;

        assertEquals(result, minMaxInIntArray.getMinElementsInIntegerArray(numbersArray));
    }

    @Test
    public void testGetMaxElementsInIntegerArray() throws Exception {
        GetMinOrMaxElementsInIntegerArray minMaxInIntArray = new GetMinOrMaxElementsInIntegerArray();
        int[] numbersArray = {-5,70,21,23,220,-46,33};
        int result = 220;

        assertEquals(result, minMaxInIntArray.getMaxElementsInIntegerArray(numbersArray));

    }


}
