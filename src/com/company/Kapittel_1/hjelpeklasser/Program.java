package com.company.Kapittel_1.hjelpeklasser;

import java.util.Arrays;

import static com.company.Kapittel_1.Delkapittel_1_1.Oppgave1_1_9__2.antallMaks;

public class Program {
    public static void main(String[] args) {
        /*int[] a = Tabell.randPerm(10);*/
        /*for (int k : a) System.out.println(k + " ");

        int m = Tabell.maks(a);

        System.out.println("\nStørste verdi ligger på index " + m);

        Tabell.skriv(Tabell.heletall(1,6));*/

        //ok 1.2.3 | 3.
        /*System.out.println(Tabell.maks(a, -1, 5));*/

        //ok 1.2.3 | 5.
        /*System.out.println(Tabell.min(a, 5, 20));*/

        //ok 1.2.3 | 6.
        /*System.out.println(Arrays.toString(a));
        Tabell.snu(a);
        System.out.println(Arrays.toString(a));*/

        //ok 1.2.3 | 7.
        /*char[] b = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(b));
        Tabell.snu(b, 1, 2);
        System.out.println(Arrays.toString(b));*/

        /*int[] a = Tabell.randPerm(20); // tilfeldig permutasjon av 1 . . 20
        int[] b = Tabell.nestMaksBakerst(a);  // metoden returnerer en tabell

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks

        Tabell.skrivln(a);        // se Oppgave 5 i Avsnitt 1.2.2
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);*/

        /*Tabell.skrivln(a);*/
        /*System.out.println(Tabell.antallNestMaks(a));*/

        //ok 1.2.12 | 2.
        /*for (int i = 1; i < 30; i++) {
            int h1 = (int)Math.ceil(Math.log(i)/Math.log(2));
            int h2 = 32 - Integer.numberOfLeadingZeros(i - 1);

            System.out.println(h1 + " " + h2);
        }*/

        //ok 1.2.13 | 1.
        /*System.out.println(Arrays.toString(Tabell.nestMaks2(a)));*/

        //ok 1.2.13 | 2.
        /*System.out.println(Arrays.toString(Tabell.nestMaksIndeks(a)));*/

        //pk 1.3.1 c)
        /*int[] a = {3,1,4,9,7,10,8,6,5,2};        // permutasjon av tallene fra 1 til 10
        Tabell.nestePermutasjon(a);              // lager neste permutasjon
        System.out.println(Arrays.toString(a));  // [3, 1, 4, 9, 8, 2, 5, 6, 7, 10]*/

        //pk 1.3.1 d)
        int[] a = {1,2,3,4,5,6,7};
        int sum = 0;

        do {
            sum += antallMaks(a);
        } while(Tabell.nestePermutasjon(a));

        System.out.println(sum);

        //ok 1.3.1 | 2.
        /*int[] a = {2,3,6,1,4,5};
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));*/

        //ok 1.3.1 | 3.
        /*int[] a = {3, 1, 4, 9, 7, 10, 8, 6, 5, 2};
        for (int i = 0; i < 10; i++) {
            Tabell.nestePermutasjon(a);
            System.out.println(Arrays.toString(a));
        }*/

        //ok 1.3.1 | 4.
        /*int[] a = {1,2,3,4,5};
        do {
            Tabell.skrivln(a);
        } while (Tabell.nestePermutasjon(a));*/


    }
}
