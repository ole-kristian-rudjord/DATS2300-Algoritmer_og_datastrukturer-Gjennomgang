package com.company.Kapittel_1.Delkapittel_1_1;

public class pk_112 {
    public static int maks(int[] a) { // a = heltallstabell
        if (a.length < 1) // hvis lengde er mindre enn 1, skriv ut "Tabellen er tom!"
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        
        int m = 0; // maks = første verdi i tabellen
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[m]) m = i; // hvis verdi(a[i]) er større en maksverdi(a[m]), gjør maks(m) til denne indeksen(i)
        }
        
        return m; // returnerer maks-indeks fra tabellen
    }
}
