package com.goit.goitonline.module10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by GRSV on 20.04.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String textFromFile = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of shifting:");

        String inputedShiftOfLetter = scanner.nextLine();
        int shifting = Integer.parseInt(inputedShiftOfLetter);

        System.out.println("Enter the message to encode:");
        String inputedMessage = scanner.nextLine();

        // Text encoded
        String encodedText = FileCesarCrypt.encode(inputedMessage, shifting);
        System.out.println("Text encoded: \"" + encodedText + "\".");

        // Write text to file then read it from file
        try {
            FileCesarCrypt dataOperations = new FileCesarCrypt();
            dataOperations.writeMessageToFile(encodedText, "outFile");
            textFromFile = dataOperations.readMessageFromFile("outFile");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Text decoded
        String decodedText = FileCesarCrypt.decode(textFromFile, shifting);
        System.out.println("Text decoded: \"" + decodedText + "\".");
    }
}
