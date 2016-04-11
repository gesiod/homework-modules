package com.goit.goitonline.module9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Grigoriy on 10.04.2016.
 */
public class CesarEcrypt {


    List<Character> alphabetEng = new ArrayList<Character>();
    List<Character> alphabetRus = new ArrayList<Character>();
    List<Character> alphabetUkr = new ArrayList<Character>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-'};
    CesarEcrypt(String) {
        for (char c = 'А'; c <= 'Я'; c++) {
            alphabetRus.add(c);
        }
        for (char c = 'а'; c <= 'я'; c++) {
            alphabetRus.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabetRus.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabetRus.add(c);
        }
    }

    String encrypt(List<Character> alphabet, String text, int m, int k) {
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
    public String decrypt(List<Character> alphabet, String text, int m, int k){
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
        //блок дешифрования данных
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

