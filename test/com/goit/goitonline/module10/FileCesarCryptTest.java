package com.goit.goitonline.module10;

import com.goit.goitonline.module3ex1.File;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by GRSV on 20.04.2016.
 */
public class FileCesarCryptTest extends TestCase {


    @Test
    public void testEncode() throws Exception {
        FileCesarCrypt fileCesarCrypt = new FileCesarCrypt();
        String testMessage = "This is test message!..";
        String result = "Ftue ue fqef yqeemsq!..";
        int shifting = 12;

        assertEquals(result, fileCesarCrypt.encode(testMessage, shifting) );


    }

    @Test
    public void testDecode() throws Exception {
        FileCesarCrypt fileCesarCrypt = new FileCesarCrypt();
        String testMessage = "Ftue ue fqef yqeemsq!..";
        String result = "This is test message!..";
        int shifting = 12;

        assertEquals(result, fileCesarCrypt.decode(testMessage, shifting) );

    }

    @Test
    public void testWriteMessageToFile() throws Exception {
        FileCesarCrypt fileCesarCrypt = new FileCesarCrypt();
        String testMessage = "This is test message!..";
        fileCesarCrypt.writeMessageToFile(testMessage, "testFile.txt");
        assertEquals(fileCesarCrypt.readMessageFromFile("testFile.txt"), testMessage);

    }


}
