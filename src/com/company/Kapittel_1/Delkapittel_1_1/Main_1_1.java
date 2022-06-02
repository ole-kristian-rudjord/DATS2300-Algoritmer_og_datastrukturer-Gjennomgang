package com.company.Kapittel_1.Delkapittel_1_1;

public class Main_1_1 {
    // Programkode 1.1.2
    public static int maks(int[] a) { // a = heltallstabell
        if (a.length < 1) // hvis lengde er mindre enn 1, skriv ut "Tabellen er tom!"
            throw new java.util.NoSuchElementException("Tabellen er tom!");

        int m = 0; // maks = første verdi i tabellen

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[m]) m = i; // hvis verdi(a[i]) er større en maksverdi(a[m]), gjør maks(m) til denne indeksen(i)
        }

        return m; // returnerer maks-indeks fra tabellen
    }

    // Oppgavekode 1.1.2 | 2.
    public static int min(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom");

        int m = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[m]) m = i;
        }

        return m;
    }

    public static void main(String[] args) {
        // Programkode 1.1.2 --test
        int[] heltalltabell = {1,5,7,2,34,76,2,21};
        System.out.println(maks(heltalltabell));

        // Oppgavekode 1.1.2 | 2. --test
        System.out.println(min(heltalltabell));
    }
}
