package com.goit.goitonline.module9;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by GRSV on 20.04.2016.
 */
public class CesarСryptTest extends TestCase {
    @Test
    public void testEncrypt() throws Exception {
        int m = 3;
        int k = 21;
        CesarСrypt cesarСrypt = new CesarСrypt();

        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("TEST STRING...");
        testArray.add("test string?");
        testArray.add("TeSt StRiNg!");

        ArrayList<String> resultArray = new ArrayList<>();
        resultArray.add("!V,!А,!8hwb333");
        resultArray.add("EЧBEАBEюгтЭІ");
        resultArray.add("!Ч,EА,E8гwЭ?");

        assertEquals(resultArray.get(0), cesarСrypt.encrypt(testArray.get(0), m, k));
        assertEquals(resultArray.get(1), cesarСrypt.encrypt(testArray.get(1), m, k));
        assertEquals(resultArray.get(2), cesarСrypt.encrypt(testArray.get(2), m, k));


    }

    @Test
    public void testDecrypt() throws Exception {
        int m = 3;
        int k = 21;
        CesarСrypt cesarСrypt = new CesarСrypt();

        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("!V,!А,!8hwb333");
        testArray.add("EЧBEАBEюгтЭІ");
        testArray.add("!Ч,EА,E8гwЭ?");


        ArrayList<String> resultArray = new ArrayList<>();
        resultArray.add("TEST STRING...");
        resultArray.add("test string?");
        resultArray.add("TeSt StRiNg!");

        assertEquals(resultArray.get(0), cesarСrypt.decrypt(testArray.get(0), m, k));
        assertEquals(resultArray.get(1), cesarСrypt.decrypt(testArray.get(1), m, k));
        assertEquals(resultArray.get(2), cesarСrypt.decrypt(testArray.get(2), m, k));

    }
}
