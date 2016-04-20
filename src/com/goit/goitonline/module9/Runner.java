package com.goit.goitonline.module9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Grigoriy on 13.04.2016.
 */
public class Runner {
    public static void main(String[] args) {
        ArrayList<String> directory = new ArrayList<>();
        CesarСrypt cesarСrypt = new CesarСrypt();

        directory.add("Stairway to heaven");
        directory.add("Smoke on the water");
        directory.add("Nothing else matters");
        directory.add("Фотографія1");
        directory.add("Фото2");
        directory.add("referat");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of shifting, <= 33");

        String inputedShiftOfLetter = scanner.nextLine();
        System.out.println("Enter the other number of shifting, <= 33");

        String inputedShiftOfLetterX = scanner.nextLine();
        int shiftOfLetter = Integer.parseInt(inputedShiftOfLetter);
        int shiftOfLetterX = Integer.parseInt(inputedShiftOfLetterX);

        if (shiftOfLetter <= 34 && shiftOfLetter > 0) {
            System.out.println();
            System.out.println("Files in the directory: ");
            System.out.println(directory.toString());
            System.out.println();

            for (String d : directory){
                System.out.println(d);
                System.out.println("Encrypted text:");
                String encrypted = cesarСrypt.encrypt(d, shiftOfLetter, shiftOfLetterX);
                System.out.println(encrypted);
                System.out.println("Decrypted text:");
                String decrypted = cesarСrypt.decrypt(encrypted, shiftOfLetter, shiftOfLetterX);
                System.out.println(decrypted + "\n");
            }

        } else{
            System.out.println("Error: number should be less than 33 and more than 0!");
        }
    }

    }

