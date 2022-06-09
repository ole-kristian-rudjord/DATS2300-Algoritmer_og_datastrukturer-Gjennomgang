package com.company.Kapittel_1.hjelpeklasser;

public class Program {
    public static void main(String[] args) {
        int[] a = Tabell.randPerm(20);
        for (int k : a) System.out.println(k + " ");

        int m = Tabell.maks(a);

        System.out.println("\nStørste verdi ligger på index " + m);
    }
}
