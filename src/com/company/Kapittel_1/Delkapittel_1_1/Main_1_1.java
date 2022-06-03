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


    //


    public static void main(String[] args) {
        int[] heltalltabell = {1,5,7,2,34,76,2,21};

        // Programkode 1.1.2
        System.out.println(maks(heltalltabell));

        // Oppgavekode 1.1.2 | 2.
        System.out.println(min(heltalltabell));

        // Oppgavekode 1.1.3 | 5.
        int[] oppgavekode1135 = minmaks(heltalltabell);
        for (int i = 0; i < oppgavekode1135.length; i++) {
            System.out.print(oppgavekode1135[i]);
        }

        System.out.println();

        // Oppgavekode 1.1.3 | 6.
        System.out.println(fak(5));

        // Oppgavekode 1.1.6 | 3.
        System.out.println(harmonisk(100));

        // Oppgavekode 1.1.6 | 4.
        System.out.println(euler(637));

        // Oppgavekode 1.1.6 | 5.
        System.out.println(oppgave1_1_6__3(100));
        int n = 10;
        for (int i = 0; i < 7; i++) // utføres 7 ganger
        {
            double x = Math.log(n) - 0.423;
            System.out.printf("n = %-8d   ln(n)-0.423 = %4.1f\n",n,x);
            n *= 10;
        }
    }
}
