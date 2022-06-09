package com.company.Kapittel_1.hjelpeklasser;

import java.util.Arrays;
import java.util.Random;

public class Tabell {
    private Tabell() {}

    //pk 1.1.8 d
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //pk 1.1.8 e
    public static int[] randPerm(int n) {
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);

        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);
            bytt(a, k, i);
        }

        return a;
    }

    //pk 1.1.8 f
    public static void randPerm(int[] a) {
        Random r = new Random();

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);
            bytt(a, k, i);
        }
    }

    //pk 1.2.1 b
    public static int maks(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til ) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;
        int maksverdi = a[fra];

        for (int i = fra + 1; i < til; i++) {
            if (a[i] > maksverdi) {
                m = i;
                maksverdi = a[m];
            }
        }

        return m;
    }

    //pk 1.2.1 c
    public static int maks(int[] a) {
        return maks(a,0,a.length);
    }

    //ok 1.2.1 | 1.
    public static int min(int[] a, int fra, int til) {
        if (fra > 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;
        int minverdi = a[fra];

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi) {
                m = i;
                minverdi = a[i];
            }
        }

        return m;
    }

    //ok 1.2.2 | 3.
    public static void bytt(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    //ok 1.2.2 | 4.
    public static void skriv(int[] a, int fra, int til) {
        if (fra < a.length || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        for (int i = fra; i < til - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[til]);
    }

    public static void skriv(int[] a) {
        skriv(a,0,a.length);
    }

    //ok 1.2.2 | 5.
    public static void skrivln(int[] a, int fra, int til) {
        if (fra < a.length || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        for (int i = fra; i < til; i++) {
            System.out.println(a[i]);
        }
    }

    public static void skrivln(int[] a) {
        skrivln(a,0,a.length);
    }
}
