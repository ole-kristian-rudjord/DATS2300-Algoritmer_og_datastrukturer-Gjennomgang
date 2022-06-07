package com.company.Kapittel_1.Delkapittel_1_1;

import java.util.*;
import java.util.stream.IntStream;

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

    /*Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell.*/
    // Oppgavekode 1.1.2 | 2.
    public static int min(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom");

        int m = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[m]) m = i;
        }

        return m;
    }

    /*Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene til minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du returnere tabellen b definert ved:   int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?*/
    // Oppgavekode 1.1.3 | 5.
    public static int[] minmaks(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom!");

        int min = 0;
        int maks = 0;
        int minverdi = a[0];
        int maksverdi = a[0];

        for (int i = 1; i < a.length; i++) {
            int verdi = a[i];

            if (verdi < minverdi) {
                min = i;
                minverdi = verdi;
            }
            else if (verdi > maksverdi) {
                maks = i;
                maksverdi = verdi;
            }
        }

        return new int[] {min, maks};
    }

    /*Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
    long fak(int n) som regner ut n! . Hvor mange multiplikasjoner utføres i metoden?*/
    // Oppgavekode 1.1.3 | 6.
    public static long fak(int n) {
        if (n < 0) throw new IllegalArgumentException("n < 0");
        long total = n;
        while (n > 1) {
            n--;
            total *= n;
        }
        return total;
    }

    // Programkode 1.1.4
    public static int maks2(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi            // 1
        // !? Hvorfor regnes ikke linjen under som to grunnleggende operasjoner? = er én, a[0] er også én
        int maksverdi = a[0];    // største verdi                       // 2

        for (int i = 1; i < a.length; i++)                              // 1 | n | n - 1
            if (a[i] > maksverdi) {                                     // 2(n - 1)
                maksverdi = a[i];     // største verdi oppdateres       // 2x
                m = i;                // indeks til største verdi oppdateres    // x
        }
        return m;   // returnerer indeks/posisjonen til største verdi   // 1

    } // maks

    // Fra boken:
    // Grunnleggende operasjoner: 1 + 1 + 1 + n + n - 1 + 2(n - 1) + 3x + 1
    // 1 + 4n + 3x
    // 1 + 4*15 + 3*2
    // 67

    // Slik jeg tenker det:
    // Grunnleggende operasjoner: 1 + 2 + 1 + n + n - 1 + 2(n - 1) + 2x + x + 1
    // 2 + 4n + 3x
    // 2 + 4*15 + 3*2
    // 68

    // Jeg trodde først denne var bedre ved å sette int "verdi = a[i]" slik at det ble færre tabellaksesser ettersom a[i] da ikke bruker i "maksverdi = verdi".
    public static int maks2test(int[] a) {
        int m = 0;                              // 1
        int maksverdi = a[0];                   // 2 // Hvorfor sier den nettbaserte læreboken at det kun er én?

        for (int i = 1; i < a.length; i++) {    // 1 | n | n - 1
            int verdi = a[i];                   // 2(n - 1)
            if (verdi > maksverdi) {            // n - 1
                m = i;                          // x
                maksverdi = verdi;              // x
            }
        }

        return m;                               // 1
    }
    // Grunnleggende opperasjoner: 1 + 2 + 1 + 1 + n + n - 1 + 2(n - 1) + n - 1 + x + x + 1
    // 1 + 5n + 2x
    // 1 + 5*15 + 2*2
    // 79


    // Programkode 1.1.5
    public static int maks3(int[] a) {
        int sist = a.length - 1;
        int m = 0;
        int maksverdi = a[0];
        int temp = a[sist];
        a[sist] = 0x7fffffff;

        for (int i = 0; ; i++) {
            if (a[i] >= maksverdi) {
                if (i == sist) {
                    a[sist] = temp;
                    return temp >= maksverdi ? sist : m;
                }
                else {
                    maksverdi = a[i];
                    m = i;
                }
            }
        }
    }

    /*Lag metoden public static double harmonisk(int n). Metoden skal ved hjelp av en løkke regne ut (og returnere) det n-te harmoniske tallet. */
    // Oppgavekode 1.1.6 | 3.
    public static double harmonisk(int n) {
        double total = 0.0;
        for (int i = 1; i <= n; i++) {
            total += 1.0 / i;
        }
        return total;
    }

    /*Lag metoden public static double harmonisk(int n). Metoden skal ved hjelp av en løkke regne ut (og returnere) det n-te harmoniske tallet. */
    // Oppgavekode 1.1.6 | 4.
    public static double euler(int n) {
        return harmonisk(n) - Math.log(n);
    }

    /*Lag en programbit som gir resultatene i Tabell 1.1.6.*/
    // Oppgavekode 1.1.6 | 3.
    public static double oppgave1_1_6__3(int n) {
        /*return Math.log(n) - 0.423;*/
        double total = 0.0;
        for (int i = 2; i <= n; i++) {
            total += 1.0 / i;
        }
        return total;
    }


    // Programkode 1.1.8 a)
    public static int[] randPerm1(int n) {
        Random r = new Random();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(n) + 1;
        }

        return a;
    }

    // Programkode 1.1.8 b)
    public static int[] randPerm2(int n) {
        Random r = new Random();
        int[] a = new int[n];

        for (int i = 0; i < n; ) {
            int k = r.nextInt(n) + 1;

            int j = 0;
            for ( ; j < i; j++) {
                if (a[j] == k) {
                    break;
                }
            }
            if (i == j) {
                a[i++] = k;
            }
        }

        return a;
    }

    // Programkode 1.1.8 c)
    public static int[] randPerm3(int n) {
        Random r = new Random();
        int[] a = new int[n];
        boolean[] har = new boolean[n];

        for (int i = 0; i < n; ) {
            int k = r.nextInt(n);
            if (!har[k]) {
                har[k] = true;
                a[i++] = k + 1;
            }
        }

        return a;
    }

    // Programkode 1.1.8 d)
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Programkode 1.1.8 e)
    public static int[] randPerm4(int n) {
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);

        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k+1);
            bytt(a,k,i);
        }

        return a;
    }

    // Programkode 1.1.8 f)
    public static void randPerm5(int[] a) {
        Random r = new Random();

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);
            bytt(a,k,i);
        }
    }

    /*I randPerm-versjonen i Programkode 1.1.8 c) brukes det en boolsk hjelpetabell. Gjør om metoden slik at den bruker samme idé, men uten hjelpetabellen. Første kall på nextInt(n) gir en indeks k. Vi legger så inn 1 i a[k]. Neste kall på nextInt(n) gir en ny indeks k. Hvis a[k] ikke er 0, kaller vi nextInt(n) på nytt. Hvis derimot a[k] er 0, legger vi inn 2 i a[k]. Osv. til hele a er fylt opp.*/
    // Oppgavekode 1.1.8 | 7.
    public static int[] randPerm5(int n) {
        Random r = new Random();
        int[] a = new int[n];
        /*boolean[] har = new boolean[n];*/

        for (int i = 0; i < n; ) {
            int k = r.nextInt(n);
            if (a[k] == 0) {
                a[k] = ++i;
            }
            /*if (!har[k]) {
                har[k] = true;
                a[i++] = k + 1;
            }*/
        }

        return a;
    }

    /*I Programkode 1.1.8 e) blir tallene som «fjernes» fra «beholderen» (tabellens «hvite» del) isteden lagt over i den «grå» delen. Lag en versjon av metoden der den «grå» delen er den venstre delen av tabellen og den «hvite» delen den høyre delen.*/
    // Oppgavekode 1.1.8 | 10.
    public static int[] randPerm6(int n) {
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);

        for (int k = 0; k < n; k++) {
            int i = r.nextInt(n - k) + k;
            bytt(a,k,i);
        }

        return a;
    }

    /*Lag void randPerm(int[] a, int v, int h) slik at den stokker om intervallet a[v:h] i tabellen a. Resten av tabellen skal være uberørt. Se Programkode 1.1.8 f)*/
    // Oppgavekode 1.1.8 | 11.
    public static void randPerm7(int[] a, int v, int h) {
        Random r = new Random();

        for (int k = h; k > v; k--) {
            int i = r.nextInt(k - v + 1) + v;
            bytt(a,k,i);
        }
    }
    // ???

    public static void randPerm9(int[] a, int v, int h)
    {
        if (v < 0 || h >= a.length)
            throw new IllegalArgumentException("Ulovlig intervall!");

        Random r = new Random();

        for (int k = h; k > v; k--)
        {
            int i = r.nextInt(k - v + 1);
            bytt(a,k,v + i);
        }
    }


    /*Tar vi ut fortløpende (uten tilbakelegging) k tilfeldige tall fra 1 til n får vi et ordnet k-utvalg (eller en k-permutasjon). Lag metoden int[] randPerm(int n, int k). Den skal returnere et tilfeldig ordnet k-utvalg (0 <= k <= n).*/
    // Oppgavekode 1.1.8 | 12.
    public static int[] randPerm8(int n, int k) {
        Random r = new Random();
        int[] a = new int[k - n + 1];

        for (int i = n; i <= k; i++) {
            a[i - n] = i;
        }

        for (int v = 0; v < n; v++) {
            int i = r.nextInt(a.length - v);
            bytt(a,v,i);
        }

        return a;
    }

    public static int[] randPerm10(int n, int k)
    {
        if (k < 0 || k > n)
            throw new IllegalArgumentException("Ulovlig k!");

        int[] a = new int[n];   // fyller tabellen med 1, 2, . . , n
        for (int i = 0; i < n; i++) a[i] = i+1;

        Random r = new Random();

        for (int j = n-1; j >= n-k; j--)
        {
            int i = r.nextInt(j+1);
            bytt(a,i,j);
        }

        int[] b = new int[k];
        System.arraycopy(a,n-k,b,0,k);
        return b;   // tabellen med permutasjonen returneres
    }

    // Programkode 1.1.9 a)
    public static int antallMaks(int[] a) {
        int antall = 0;
        int maksverdi = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                antall++;
                maksverdi = a[i];
            }
        }

        return antall;
    }


    public static void main(String[] args) {
        /*int[] heltalltabell = {1,5,7,2,34,76,2,21};*/

        // Programkode 1.1.2
        /*System.out.println(maks(heltalltabell));*/

        // Oppgavekode 1.1.2 | 2.
        /*System.out.println(min(heltalltabell));*/

        // Oppgavekode 1.1.3 | 5.
        /*int[] oppgavekode1135 = minmaks(heltalltabell);
        for (int i = 0; i < oppgavekode1135.length; i++) {
            System.out.print(oppgavekode1135[i]);
        }*/

        /*System.out.println();*/

        // Oppgavekode 1.1.3 | 6.
        /*System.out.println(fak(5));*/

        // Oppgavekode 1.1.6 | 3.
        /*System.out.println(harmonisk(100));*/

        // Oppgavekode 1.1.6 | 4.
        /*System.out.println(euler(637));*/

        // Oppgavekode 1.1.6 | 5.
        /*System.out.println(oppgave1_1_6__3(100));
        int n = 10;
        for (int i = 0; i < 7; i++) // utføres 7 ganger
        {
            double x = Math.log(n) - 0.423;
            System.out.printf("n = %-8d   ln(n)-0.423 = %4.1f\n",n,x);
            n *= 10;
        }*/

        // Programkode 1.1.8 c)
        /*System.out.println(Arrays.toString(randPerm4(10)));*/

        // Oppgave 1.1.8 | 1.
        // Programkode 1.1.8 b)
        /*System.out.println(Arrays.toString(randPerm2(10)));*/

        // Oppgave 1.1.8 | 2.
        /*int n2 = 100000;
        long tid2 = System.currentTimeMillis();
        int[] a2 = randPerm2(n2);
        tid2 = System.currentTimeMillis() - tid2;
        System.out.println(tid2);*/

        // Oppgave 1.1.8 | 4.
        // Programmkode 1.1.8 c)
        /*System.out.println(Arrays.toString(randPerm3(10)));*/

        // Oppgave 1.1.8 | 5.
        /*int n3 = 100000;
        long tid3 = System.currentTimeMillis();
        int[] a3 = randPerm3(n3);
        tid3 = System.currentTimeMillis() - tid3;
        System.out.println(tid3);*/

        // Oppgave 1.1.8 | 9.
        /*int n4 = 100000;
        long tid4 = System.currentTimeMillis();
        int[] a4 = randPerm4(n4);
        tid4 = System.currentTimeMillis() - tid4;
        System.out.println(tid4);*/

        // Oppgavekode 1.1.8 | 10.
        /*System.out.println(Arrays.toString(randPerm6(10)));*/

        // Oppgavekode 1.1.8 | 11.
        /*int[] tabell1 = {1,2,3,4,5,6,7,8,9,10};
        randPerm7(tabell1, 5, 8);
        System.out.println(Arrays.toString(tabell1));

        int[] tabell2 = {1,2,3,4,5,6,7,8,9,10};
        randPerm7(tabell2, 5, 8);
        System.out.println(Arrays.toString(tabell2));

        int[] tabell3 = {1,2,3,4,5,6,7,8,9,10};
        randPerm7(tabell3, 5, 8);
        System.out.println(Arrays.toString(tabell3));

        int[] tabell4 = {1,2,3,4,5,6,7,8,9,10};
        randPerm9(tabell4, 5, 8);
        System.out.println(Arrays.toString(tabell4));

        int[] tabell5 = {1,2,3,4,5,6,7,8,9,10};
        randPerm9(tabell5, 5, 8);
        System.out.println(Arrays.toString(tabell5));

        int[] tabell6 = {1,2,3,4,5,6,7,8,9,10};
        randPerm9(tabell6, 5, 8);
        System.out.println(Arrays.toString(tabell6));*/

        // Oppgavekode 1.1.8 | 12.
        /*System.out.println(Arrays.toString(randPerm8(2, 8)));

        System.out.println(Arrays.toString(randPerm10(10, 5)));*/

        // Programkode 1.1.9 a)
        /*System.out.println(antallMaks(randPerm6(100000)));*/

        // Programkode 1.1.11
        int[] a = {8,3,5,7,9,6,10,2,1,4};
        IntStream s = Arrays.stream(a);
        OptionalInt maks = s.max();
        if (maks.isPresent()) System.out.println(maks.getAsInt());
        else System.out.println("Ingen verdi!");

        s = Arrays.stream(a);
        OptionalInt min = s.min();
        if (min.isPresent()) System.out.println(min.getAsInt());
        else System.out.println("Ingen verdi!");

        s = Arrays.stream(a);
        int sum = s.sum();
        System.out.println(sum);

        s = Arrays.stream(a);
        OptionalDouble gjennomsnitt = s.average();
        if (gjennomsnitt.isPresent()) System.out.println(gjennomsnitt.getAsDouble());
        else System.out.println("Ingen verdi!");

        s = Arrays.stream(a);
        IntSummaryStatistics k = s.summaryStatistics();
        System.out.printf("%-8s%3d\n", "maks: ", k.getMax());
        System.out.printf("%-8s%3d\n", "min: ", k.getMin());
        System.out.printf("%-8s%3d\n", "sum: ", k.getSum());
        System.out.printf("%-8s%3d\n", "antall: ", k.getCount());
        System.out.printf("%-8s%3.1f\n","snitt: ", k.getAverage());
    }
}
