package com.goit.goitonline.module5ex1;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by GRSV on 20.04.2016.
 */
public class BubleSorterTest extends TestCase {

    @Test
    public void testSort() throws Exception {
        List<Integer> integers = Arrays.asList(1,4,5,3,9,5,12,44,34,60,7,45,77,23,88,1095,12);
        List<Integer> result = Arrays.asList(1, 3, 4, 5, 5, 7, 9, 12, 12, 23, 34, 44, 45, 60, 77, 88, 1095);
        BubleSorter bubleSorter = new BubleSorter();
        assertEquals(result, bubleSorter.sort(integers));
    }

}
