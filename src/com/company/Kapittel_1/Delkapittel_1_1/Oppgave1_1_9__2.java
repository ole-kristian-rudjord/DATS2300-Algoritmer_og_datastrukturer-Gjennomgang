package com.company.Kapittel_1.Delkapittel_1_1;

import java.util.Arrays;
import java.util.Random;

public class Oppgave1_1_9__2 {
    private static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) {
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);

        for (int i = 0; i < n; i++) {
            int v = r.nextInt(n - i ) + i;
            bytt(a,i,v);
        }

        return a;
    }

    public static void omstokkRandPerm(int[] a) {
        Random r = new Random();

        for (int i = a.length - 1; i > 0; i--) {
            int v = r.nextInt(i + 1);
            bytt(a,i,v);
        }
    }

    public static int antallMaks(int[] a) {
        int antall = 0;
        int maks = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maks) {
                maks = a[i];
                antall++;
            }
        }

        return antall;
    }

    public static void main(String[] args) {
        /*System.out.println(antallMaks(randPerm(100000)));*/
        int sum = 0;
        int antall = 0;
        int[] a = randPerm(100000);

        for (int i = 0; i < 100; i++) {
            omstokkRandPerm(a);
            sum += antallMaks(a);
            antall++;
        }

        System.out.println(sum/antall);
    }
}
