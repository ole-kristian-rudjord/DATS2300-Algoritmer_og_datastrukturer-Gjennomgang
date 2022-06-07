package com.company.Kapittel_1.Delkapittel_1_1;

import static com.company.Kapittel_1.Delkapittel_1_1.Oppgave1_1_9__2.randPerm;

public class Oppgave1_1_10__1 {
    public static int kostnader(int[] a) {
        int m = 0;
        for (int i = 1; i < a.length; i++) {

        }
        return m;
    }

    public static int maks1(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom.");

        int m = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[m]) m = i;
        }

        return m;
    }

    public static int maks2(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom.");

        int m = 0;
        int maks = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maks) {
                m = i;
                maks = a[i];
            }
        }

        return m;
    }

    public static int maks3(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom.");

        int sist = a.length - 1;
        int m = 0;
        int maks = a[0];
        int temp = a[sist];
        a[sist] = 0x7fffffff;

        for (int i = 0; ; i++) {
            if (a[i] >= maks) {
                if (i == sist) {
                    a[sist] = temp;
                    return temp >= maks ? sist : m;
                }
                else {
                    maks = a[i];
                    m = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 100_000;
        int antall = 2000;
        long tid = 0;
        /*int[] a = randPerm(n);*/
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        tid = System.currentTimeMillis();
        for (int i = 0; i < antall; i++) kostnader(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("Faste kostnader: " + tid + " millisek");

        tid = System.currentTimeMillis();
        for (int i = 0; i < antall; i++) maks1(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("maks1(): " + tid + " millisek");

        tid = System.currentTimeMillis();
        for (int i = 0; i < antall; i++) maks2(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("maks2(): " + tid + " millisek");

        tid = System.currentTimeMillis();
        for (int i = 0; i < antall; i++) maks3(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("maks3(): " + tid + " millisek");
    }
}
