package com.goit.goitonline.module9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Grigoriy on 10.04.2016.
 */
public class CesarСrypt {


    List<Character> alphabet = new ArrayList<Character>();

    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-'};
    private final static char[] UKRAINIAN = {'І',  'і', 'Є','є', 'Ї', 'ї', '`'};
    CesarСrypt() {
        for (char c = 'А'; c <= 'Я'; c++) {
            alphabet.add(c);
        }
        for (char c = 'а'; c <= 'я'; c++) {
            alphabet.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }
        for (char c : UKRAINIAN) {
            alphabet.add(c);
        }
    }

    public String encrypt(String text, int m, int k) {
        int n = alphabet.size();
        m = m % n;
        k = k % n;
        if (gcd(n, m) != 1) {
            return null;
        }
        StringBuilder cryptogram = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (index * m + k) % n;
            cryptogram.append(alphabet.get(index));
        }
        return cryptogram.toString();
    }
    public String decrypt(String text, int m, int k){
        int n = alphabet.size();
        m = m % n;
        k = k % n;
        int reversedM = -1;
        for (int i = 0; i < n; i++) {
            if ((i * m) % n == 1) {
                reversedM = i;
                break;
            }
        }
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (((index - k) * reversedM) % n + n) % n;
            newText.append(alphabet.get(index));
        }
        return newText.toString();

    }

    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
}

