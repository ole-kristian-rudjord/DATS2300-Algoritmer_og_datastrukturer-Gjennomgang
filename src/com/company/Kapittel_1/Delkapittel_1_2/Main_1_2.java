package com.company.Kapittel_1.Delkapittel_1_2;

public class Main_1_2 {

    //pk 1.2.1 a+b
    public static int maks(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
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
        return maks(a, 0, a.length);
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

    public static int min(int[] a) {
        return min(a, 0, a.length);
    }


    //ok 1.2.1 | 2.
    public static int min2(int[] a, int fra, int til) {
        int sist = til - 1;
        int m = fra;
        int maksverdi = a[fra];
        int temp = a[sist];
        a[sist] = 0x7fffffff;

        for (int i = fra + 1; ; i++) {
            if (a[i] >= maksverdi) {
                if (i == sist) {
                    a[sist] = temp;
                    return temp >= maksverdi ? sist : m;
                } else {
                    maksverdi = a[i];
                    m = i;
                }
            }
        }
    }


    public static void main(String[] args) {

    }
}
