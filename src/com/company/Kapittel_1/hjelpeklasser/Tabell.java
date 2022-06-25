package com.company.Kapittel_1.hjelpeklasser;

import java.util.Arrays;
import java.util.NoSuchElementException;
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
    //ok 1.2.3 | 3.
    //ok 1.2.3 | 4.
    public static int maks(int[] a, int fra, int til) {
        if (a == null) {
            throw new NoSuchElementException("Tabellen eksisterer ikke");
        }
        fratilKontroll(a.length, fra, til);
        if (fra == til) {
            throw new NoSuchElementException("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
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
        fratilKontroll(a.length, fra, til);

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
    public static void bytt(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //ok 1.2.2 | 4.
    public static void skriv(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[til - 1]);
    }

    public static void skriv(int[] a) {
        skriv(a,0,a.length);
    }

    //ok 1.2.2 | 5.
    public static void skrivln(int[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivln(int[] a) {
        skrivln(a,0,a.length);
    }

    //ok 1.2.2 | 6.
    public static void skriv(char[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[til - 1]);
    }

    public static void skriv(char[] a) {
        skriv(a, 0, a.length);
    }

    public static void skrivln(char[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivln(char[] a) {
        skrivln(a, 0, a.length);
    }

    //ok 1.2.2 | 7.
    public static int[] naturligeTall(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n skal ikke være mindre enn 1");
        }

        int[] a = new int[n];
        Arrays.setAll(a, i -> i + 1);

        return a;
    }

    public static int[] heletall(int fra, int til) {
        if (fra > til) {
            throw new IllegalArgumentException("fra kan ikke være mindre enn til");
        }

        int[] a = new int[til - fra];

        for (int i = 0; i < til - fra; i++) {
            a[i] = fra + i;
        }

        return a;
    }


    //pk 1.2.3 a)
    public static void fratilKontroll(int tabellengde, int fra, int til) {
        if (fra < 0) { // fra er negativ
            throw new ArrayIndexOutOfBoundsException("fra(" + fra + ") er negativ!");
        }
        if (til > tabellengde) { // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException("til(" + til + ") > tabellengde(" + tabellengde + ")");
        }
        if (fra > til) { // fra er større enn til
            throw new IllegalArgumentException("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
        }
    }

    //pk 1.2.3 d)
    public static void vhKontroll(int tabellengde, int v, int h) {
        if (v < 0) {
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");
        }
        if (h >= tabellengde) {
            throw new ArrayIndexOutOfBoundsException("h(" + h + ") >= tabellengde(" + tabellengde + ")");
        }
        if (v > h + 1) {
            throw new IllegalArgumentException("v = " + v + ", h = " + h);
        }
    }


    //ok 1.2.3 | 6.
    /*public static void snu(int[] a, int v, int h) {
        vhKontroll(a.length, v, h);

        while(v < h) bytt(a, v++, h--);
    }

    public static void snu(int[] a) {
        snu(a, 0, a.length - 1);
    }*/

    //ok 1.2.3 | 7.
    /*public static void snu(char[] a, int v, int h) {
        vhKontroll(a.length, v, h);

        while(v < h) bytt(a, v++, h--);
    }*/

    /*public static void snu(char[] a) {
        snu(a, 0, a.length - 1);
    }*/


    //pk 1.2.4 a
    /*public static int[] nestMaks(int[] a) {
        int n = a.length;

        if (n < 2) {
            throw new NoSuchElementException("a.length(" + n + ") < 2!");
        }

        int m = maks(a);

        int nm;

        if (m == 0) {
            nm = maks(a, 1, n);
        }
        else if (m == n - 1) {
            nm = maks(a, 0, n - 1);
        }
        else {
            int mv = maks(a, 0, m);
            int mh = maks(a, m + 1, n);
            nm = a[mh] > a[mv] ? mh : mv;
        }

        return new int[] {m, nm};
    }*/

    //ok 1.2.4 | 2.
    /*public static int[] nestMaks(int[] a) {
        int n = a.length;

        if (n < 2) {
            throw new NoSuchElementException("a.length(" + n + ") < 2!");
        }

        int m = maks(a);

        bytt(a, 0, m);

        int nm = maks(a, 1, n);

        if (nm == m) {
            nm = 0;
        }

        bytt(a, 0, m);

        return new int[] {m, nm};
    }*/


    //ok 1.2.4 | 3.
    public static int[] nestMaksBakerst(int[] a) {

        if (a.length < 2) {
            throw new NoSuchElementException("a.length(" + a.length + ") < 2!");
        }

        int m = maks(a);

        bytt(a, m, a.length - 1);

        int nm = maks(a, 0, a.length - 1);

        if (nm == m) {
            nm = a.length - 1;
        }

        bytt(a, m, a.length - 1);

        return new int[] {m, nm};
    }

    //ok 1.2.4 | 4.
    public static void sortering(int[] a) {
        for (int i = a.length; i > 1; i--) {
            int m = maks(a, 0, i);
            bytt(a, m, i - 1);
        }
    }

    //ok 1.2.4 | 5.
    public static void sorteringMin(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int m = min(a, i, a.length);
            bytt(a, m, i);
        }
    }

    //pk 1.2.5 a)
    /*public static int[] nestMaks(int[] a) {
        int n = a.length;

        if (n < 2) {
            throw new NoSuchElementException("a.length(" + n + ") < 2!");
        }

        int m = 0;
        int nm = 1;

        if (a[1] > a[0]) {
            m = 1;
            nm = 0;
        }

        int maksverdi = a[m];
        int nestmaksverdi = a[nm];

        for (int i = 2; i < n; i++) {
            if (a[i] > nestmaksverdi) {
                if (a[i] > maksverdi) {
                    nm = m;
                    nestmaksverdi = maksverdi;

                    m = i;
                    maksverdi = a[m];
                }
                else {
                    nm = i;
                    nestmaksverdi = a[nm];
                }
            }
        }

        return new int[] {m, nm};
    }*/

    //ok 1.2.5 | 2.
    public static int[] nestMaks(int[] a) {

        if (a.length < 2) {
            throw new NoSuchElementException("a.length(" + a.length + ") < 2!");
        }

        int m = 0;
        int nm = 1;

        if (a[1] > a[0]) {
            m = 1;
            nm = 0;
        }

        int maksverdi = a[m];
        int nestmaksverdi = a[nm];

        int sist = a.length - 1;
        int temp = a[sist];
        a[sist] = 0x7fffffff;

        for (int i = 2; ; i++) {
            if (a[i] > nestmaksverdi) {
                if (i == sist) {
                    a[sist] = temp;
                    return temp > maksverdi ? new int[] {i, nm} : new int[] {m, nm};
                }
                else {
                    if (a[i] > maksverdi) {
                        nm = m;
                        nestmaksverdi = maksverdi;

                        m = i;
                        maksverdi = a[m];
                    }
                    else {
                        nm = i;
                        nestmaksverdi = a[nm];
                    }
                }
            }
        }
    }

    //ok 1.2.5 | 3.
    public static int[] nestMin(int[] a) {
        int n = a.length;

        if (n < 2) {
            throw new NoSuchElementException("a.length(" + n + ") < 2!");
        }

        int m = 0;
        int nm = 1;

        if (a[1] < a[0]) {
            m = 1;
            nm = 0;
        }

        int minverdi = a[m];
        int nestminverdi = a[nm];

        for (int i = 2; i < n; i++) {
            if (a[i] < nestminverdi) {
                if (a[i] < minverdi) {
                    nm = m;
                    nestminverdi = minverdi;

                    m = i;
                    minverdi = a[m];
                }
                else {
                    nm = i;
                    nestminverdi = a[nm];
                }
            }
        }

        return new int[] {m, nm};
    }

    //ok 1.2.5 | 4.
    public static int[] tredjeMaks(int[] a) {
        int n = a.length;

        if (n < 3) {
            throw new NoSuchElementException("a.length(" + n + ") > 3!");
        }

        int m1 = 0;
        int m2 = 1;
        int m3 = 2;

        if (a[m2] > a[m1]) {
            m1 = 1;
            m2 = 0;
        }

        if (a[m3] > a[m1]) {
            int temp = m3;
            m3 = m1;
            m1 = temp;
        }

        if (a[m3] > a[m2]) {
            int temp = m3;
            m3 = m2;
            m2 = temp;
        }

        int maksverdi = a[m1];
        int nestmaksverdi = a[m2];
        int tredjemaksverdi = a[m3];

        for (int i = 3; i < n; i++) {
            if (a[i] > tredjemaksverdi) {
                if (a[i] > nestmaksverdi) {
                    if (a[i] > maksverdi) {
                        m3 = m2;
                        tredjemaksverdi = nestmaksverdi;

                        m2 = m1;
                        nestmaksverdi = maksverdi;

                        m1 = i;
                        maksverdi = a[i];
                    }
                    else {
                        m3 = m2;
                        tredjemaksverdi = nestmaksverdi;

                        m2 = i;
                        nestmaksverdi = a[i];
                    }
                }
                else {
                    m3 = i;
                    tredjemaksverdi = a[i];
                }
            }
        }

        return new int[] {m1, m2, m3};
    }

    //ok 1.2.7 | 2.
    public static int antallNestMaks(int[] a) {
        int n = a.length;

        if (n < 2) throw
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = 0;
        int nm = 1;

        if (a[1] > a[0]) { m = 1; nm = 0; }

        int maksverdi = a[m];
        int nestmaksverdi = a[nm];

        int teller = 0;

        for (int i = 2; i < n; i++)
        {
            if (a[i] > nestmaksverdi)
            {
                teller++;
                if (a[i] > maksverdi)
                {
                    nm = m;
                    nestmaksverdi = maksverdi;

                    m = i;
                    maksverdi = a[m];
                }
                else
                {
                    nm = i;
                    nestmaksverdi = a[nm];
                }
            }
        }

        return teller;
    }


    //pk 1.2.13 a)
    public static int[] nestMaks2(int[] a) {
        int n = a.length;

        if (n < 2) { // Må ha minst to verider
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");
        }

        int[] b = new int[2*n]; // Lager tomt turneringstre
        System.arraycopy(a, 0, b, n, n); // Legger a bakerst i b

        for (int k = 2*n - 2; k > 1; k-= 2) { // Fyller turneringstreet. Starter bakerst - 2 i tabellen.
            b[k/2] = Math.max(b[k], b[k+1]); // b[k/2] --> finner foreldernoden. Math.max(b[k], b[k+1]) --> finner den største av de nåværende søskennodene.
        }

        int maksverdi = b[1];
        int nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2*n - 1, k = 2; k < m; k *= 2) {
            int temp = b[k+1];
            if (maksverdi != b[k]) {
                temp = b[k];
                k++;
            }
            if (temp > nestmaksverdi) {
                nestmaksverdi = temp;
            }
        }

        return new int[] {maksverdi, nestmaksverdi};
    }

    //ok 1.2.13 | 2.
    public static int[] nestMaksIndeks(int[] a) {
        int n = a.length;

        if (n < 2) { // Må ha minst to verider
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");
        }

        int[] b = new int[2*n]; // Lager tomt turneringstre
        System.arraycopy(a, 0, b, n, n); // Legger a bakerst i b

        for (int k = 2*n - 2; k > 1; k-= 2) { // Fyller turneringstreet. Starter bakerst - 2 i tabellen.
            b[k/2] = Math.max(b[k], b[k+1]); // b[k/2] --> finner foreldernoden. Math.max(b[k], b[k+1]) --> finner den største av de nåværende søskennodene.
        }

        int maksverdi = b[1];
        int maksindeks = 1;
        int nestmaksverdi = Integer.MIN_VALUE;
        int nestmaksindeks = b.length - 1;

        for (int m = 2*n - 1, k = 2; k < m; k *= 2) {
            int temp = b[k+1];
            int tempindeks = k+1;
            if (maksverdi != b[k]) {
                temp = b[k];
                tempindeks = k;
                k++;
            }
            if (temp > nestmaksverdi) {
                nestmaksverdi = temp;
                nestmaksindeks = tempindeks;
            }
        }

        System.out.println(Arrays.toString(b));

        return new int[] {maksindeks, nestmaksindeks};
    }

    //ok 1.2.13 | 3.
    public static void kopier(int[] a, int i, int[] b, int j, int ant) {
        for (int n = i + ant; i < n;) {
            b[j++] = a[i++];
        }
    }

    //ok 1.2.13 | 3. a)
    public static void aForstIb(int[] a, int[] b) {
        kopier(a, 0, b, 0, a.length);
    }

    //ok 1.2.13 | 3. b)
    public static void aSistIb(int[] a, int[] b) {
        kopier(a, 0, b, b.length - a.length, a.length);
    }

    //ok 1.2.13 | 3. c)
    public static void aMidtIb(int[] a, int[] b) {
        kopier(a, 0, b, (b.length - a.length)/ 2, a.length);
    }


    //ok 1.2.14 | 1.
    public static int[] minmaks(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] > a[j]) {
                bytt(a,i,j);
            }
            i++;
            j--;
        }

        if (i == j) {
            if (a[i] < a[i+1]) {
                i++;
            }
        }

        int[] b = {a[min(a,0,i)], a[maks(a,i,a.length)]};

        return b;
    }

    //ok 1.2.14 | 2.
    public static int kVerdi(int[] a, int k) {
        if (a.length < k + 1 || k < 0) {
            throw new IllegalArgumentException("Ulovlig verdi på k!");
        }

        for (int i = 0; i <= k; i++) {
            int m = min(a,i,a.length);
            bytt(a,i,m);
        }

        return a[k];
    }

    //pk 1.3.1 a)
    public static void snu(int[] a, int v, int h) {
        while (v < h) {
            bytt(a, v++, h--);
        }
    }

    public static void snu(int[] a, int v) {
        snu(a, v, a.length - 1);
    }

    public static void snu(int[] a) {
        snu(a, 0, a.length - 1);
    }

    //ok 1.3.1 b)
    public static boolean nestePermutasjon(int[] a) {
        int i = a.length - 2;                    // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) {      // går mot venstre
            i--;
        }
        if (i < 0) return false;                 // a = {n, n-1, . . . , 2, 1}

        int j = a.length - 1;                    // j starter bakerst
        while (a[j] < a[i]) {
            j--;                                 // stopper når a[j] > a[i]
        }
        bytt(a,i,j);
        snu(a,i + 1);                         // bytter og snur

        return true;
    }
}














