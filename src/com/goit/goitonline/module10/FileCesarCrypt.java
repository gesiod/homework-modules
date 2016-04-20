package com.goit.goitonline.module10;

import java.io.*;

/**
 * Created by GRSV on 20.04.2016.
 */
public class FileCesarCrypt {

    public static String encode(String string, int offset) {
        StringBuilder encoded = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    encoded.append((char)('A' + ((c - 'A' + offset) % 26)));
                } else {
                    encoded.append((char)('a' + ((c - 'a' + offset) % 26)));
                }
            } else {
                encoded.append(c);
            }
        }

        return encoded.toString();
    }

    public static String decode(String string, int offset) {
        return encode(string, 26 - offset);
    }


    public void writeMessageToFile(String text, String fileName) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        out.writeUTF(text);
        out.close();
    }

    public String readMessageFromFile(String outFile) throws IOException {
        DataInputStream in = null;
        String textFromFile = null;
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(outFile)));
            textFromFile = in.readUTF();
            return textFromFile;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }

        return textFromFile;
    }
}
