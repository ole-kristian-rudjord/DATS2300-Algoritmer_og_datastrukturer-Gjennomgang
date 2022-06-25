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
        /*int[] a = {1,2,3,4,5,6,7};
        int sum = 0;

        do {
            sum += antallMaks(a);
        } while(Tabell.nestePermutasjon(a));

        System.out.println(sum);*/

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

        //pk 1.3.2 b)
        /*int[] a = {1,2,4,3,6,7,9,5,8,10};
        System.out.println(Tabell.inversjoner(a));  // Utskrift: 5*/

        //pk 1.3.2 d)
        /*int[] a = {}, b = {5}, c = {1,2,4,3,6,7,9,5,8,10};  // heltallstabeller
        int[] d = {1,2,3,4,5,6,7,8,9,10};                   // heltallstabell

        boolean x = Tabell.erSortert(a), y = Tabell.erSortert(b);
        boolean z = Tabell.erSortert(c), u = Tabell.erSortert(d);

        System.out.println(x + " " + y + " " + z + " " + u); // Utskrift: true true false true*/

        //ok 1.3.2 | 1.
        /*int[] a = {3, 5, 4, 7, 6, 8, 1, 2, 9, 10};
        System.out.println(Tabell.inversjoner(a));*/

        //ok 1.3.2 | 2.
        /*int[] a = {10, 9, 1, 2, 8, 3, 4, 5, 6, 7};
        System.out.println(Tabell.inversjoner(a));
        int[] b = {7, 6, 5, 4, 3, 8, 2, 1, 9, 10};
        System.out.println(Tabell.inversjoner(b));*/


        //pk 1.3.3 b)
        /*int[] a = {5, 9, 6, 10, 2, 7, 3, 8, 4, 1};          // en heltallstabell
        System.out.println(Arrays.toString(a));             // skriver ut tabellen

        int antInv = Tabell.inversjoner(a);                 // Programkode 1.3.2 a)
        System.out.println("Inversjoner: " + antInv);       // skriver ut

        int antOmb = Tabell.boble(a);                       // ombyttinger
        antInv = Tabell.inversjoner(a);                     // Programkode 1.3.2 a)

        System.out.println(Arrays.toString(a));             // skriver ut tabellen
        System.out.print("Ombyttinger: " + antOmb + "  ");  // ombyttinger
        System.out.println("Inversjoner: " + antInv);       // inversjoner

        // Utskrift:
        // [5, 9, 6, 10, 2, 7, 3, 8, 4, 1]
        // Inversjoner: 29
        // [5, 6, 9, 2, 7, 3, 8, 4, 1, 10]
        // Ombyttinger: 7  Inversjoner: 22*/


        //pk 1.3.3 c)
        /*int[] a = {5, 9, 6, 10, 2, 7, 3, 8, 4, 1};

        for (int i = 1; i < a.length; i++)
        {
            int antall = Tabell.boble(a);  // antall ombyttinger
            System.out.println(i + ". " + Arrays.toString(a) + " " + antall);
        }
        *//*Utskrift:
        1. [5, 6, 9, 2, 7, 3, 8, 4, 1, 10] 7
        2. [5, 6, 2, 7, 3, 8, 4, 1, 9, 10] 6
        2. [5, 2, 6, 3, 7, 4, 1, 8, 9, 10] 4
        4. [2, 5, 3, 6, 4, 1, 7, 8, 9, 10] 4
        5. [2, 3, 5, 4, 1, 6, 7, 8, 9, 10] 3
        6. [2, 3, 4, 1, 5, 6, 7, 8, 9, 10] 2
        7. [2, 3, 1, 4, 5, 6, 7, 8, 9, 10] 1
        8. [2, 1, 3, 4, 5, 6, 7, 8, 9, 10] 1
        9. [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 1*/

        //ok 1.3.3 | 1.
        /*for (int i = 0; i < 10; i++) {
            int[] a = Tabell.randPerm(10);
            System.out.println(Arrays.toString(a));
            Tabell.boblesortering(a);
            System.out.println(Arrays.toString(a));
            System.out.println();
        }*/

        //ok 1.3.3 | 3.
        for (int i = 0; i < 3; i++) {
            int[] a = Tabell.randPerm(10);
            System.out.println(Arrays.toString(a));
            Tabell.boblesorteringMotsatt(a);
            System.out.println(Arrays.toString(a));
            System.out.println();
        }
    }
}
