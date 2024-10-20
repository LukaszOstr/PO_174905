import java.util.Random;
import java.lang.Math;

public class zestaw4 {

    public static int[] generujTablice(int n, int minWartosc, int maxWartosc){
        Random rng = new Random();
        int[] tab = new int[n];
        for(int i=0; i<n; i++){
            tab[i] = rng.nextInt(minWartosc, maxWartosc);
        }

        return tab;
    }

    public static int ileNieparzystych(int[] tab){
        int n = tab.length;
        int suma = 0;
        for(int i=0; i<n; i++){
            if(tab[i] % 2 == 1){
                suma++;
            }
        }
        return suma;

    }
    public static int ileParzystych(int[] tab){
        int n = tab.length;
        int suma = 0;
        for(int i=0; i<n; i++){
            if(tab[i] % 2 == 0){
                suma++;
            }
        }
        return suma;

    }

    public static int ileDodatnich(int[] tab){
        int n = tab.length;
        int suma = 0;
        for(int i=0; i<n; i++){
            if(tab[i] > 0){
                suma++;
            }
        }
        return suma;

    }


    public static int ileUjemnych(int[] tab){
        int n = tab.length;
        int suma = 0;
        for(int i=0; i<n; i++){
            if(tab[i] < 0){
                suma++;
            }
        }
        return suma;

    }

    public static int ileZerowych(int[] tab){
        int n = tab.length;
        int suma = 0;
        for(int i=0; i<n; i++){
            if(tab[i] == 0){
                suma++;
            }
        }
        return suma;

    }

    public static int ileMaxymalnych(int[] tab){
        int n = tab.length;
        int maks = tab[0];
        for(int i=0; i<n; i++){
            if(tab[i] > maks){
                maks = tab[i];
            }
        }
        return maks;

    }

    public static int ileMinimalnych(int[] tab){
        int n = tab.length;
        int min = tab[0];
        for(int i=0; i<n; i++){
            if(tab[i] < min){
                min = tab[i];
            }
        }
        return min;

    }

    public static int ileUnikalnych(int[] tab){
        int n = tab.length;
        int unik = n;
        for(int i=0; i<n; i++){
            int powtorz=0;
            for(int j=0; j<n; j++){
                if(tab[i] == tab[j]){
                    powtorz++;
                }
            }
            if(powtorz > 1){
                unik--;
            }
        }
        return unik;

    }

    public static int sumaDodatnich(int[] tab){
        int n = tab.length;
        int suma = 0;
        for(int i=0; i<n; i++){
            if(tab[i] > 0){
                suma = tab[i] + suma;
            }
        }
        return suma;

    }

    public static int sumaUjemnych(int[] tab){
        int n = tab.length;
        int suma = 0;
        for(int i=0; i<n; i++){
            if(tab[i] < 0){
                suma = tab[i] + suma;
            }
        }
        return suma;

    }

    public static double sumaOdwrotnosci(int[] tab){
        int n = tab.length;
        int suma = 0;
        for(int i=0; i<n; i++){
            suma = 1/tab[i] + suma;
        }
        return suma;

    }

    public static double sredniaArytmetyczna(int[] tab){
        int n = tab.length;
        int suma=0;
        for(int i=0; i<n; i++){
            suma = tab[i] + suma;
        }
        return (double) suma / n;

    }

    public static double sredniaGeometryczna(int[] tab){
        int n = tab.length;
        int iloczyn=1;
        for(int i=0; i<n; i++){
            iloczyn = tab[i] * iloczyn;
        }
        return Math.pow(iloczyn, (double) 1 /n);

    }

    public static double sredniaHarmoniczna(int[] tab){
        int n = tab.length;
        int suma=0;
        for(int i=0; i<n; i++){
            suma = 1/tab[i] + suma;
        }
        return (double) n / suma;

    }

    public static double[] funkcjaLiniowa(int[] tab, double a, double b){
        int n = tab.length;
        double[] tab2 = new double[n];

        //int suma = 0;
        for(int i=0; i<n; i++){
            tab2[i] = a * tab[i] + b;
        }
        return tab2;

    }

    public static double[] funkcjaKwadratowa(int[] tab, double a, double b, double c){
        int n = tab.length;
        double[] tab2 = new double[n];

        //int suma = 0;
        for(int i=0; i<n; i++){
            tab2[i] = a * tab[i] * tab[i] + b * tab[i] + c;
        }
        return tab2;

    }

    public static double[] funkcjaWykladnicza(int[] tab, double a){
        int n = tab.length;
        double[] tab2 = new double[n];

        //int suma = 0;
        for(int i=0; i<n; i++){
            tab2[i] = Math.pow(a,tab[i]);
        }
        return tab2;

    }

    public static double[] funkcjaSignum(int[] tab){
        int n = tab.length;
        double[] tab2 = new double[n];

        //int suma = 0;
        for(int i=0; i<n; i++){
            if(tab[i] < 0){
                tab2[i] = -1;
            }
            else if (tab[i] > 0) {
                tab2[i] = 1;
            }

            else{
                tab2[i] = 0;
            }
        }
        return tab2;

    }

    public static int[] najdluzszyCiagDodatnich(int[] tab){


        int n = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] > 0){
                n++;
            }
        }
        int[] tab2 = new int[n];

        for(int i=0, j=0; i<tab.length; i++){
            if(tab[i] > 0){
                tab2[j] = tab[i];
                j++;
            }
        }
        return tab2;

    }

    public static int[] najdluzszyCiagUjemnych(int[] tab){


        int n = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] < 0){
                n++;
            }
        }
        int[] tab2 = new int[n];

        for(int i=0, j=0; i<tab.length; i++){
            if(tab[i] < 0){
                tab2[j] = tab[i];
                j++;
            }
        }
        return tab2;

    }

    public static void odwrocTablice(int[] tab){


        int n = tab.length;



        for(int i=0; i<n/2; i++){
            int temp = tab[i];
            tab[i] = tab[n-1-i];
            tab[n-1-i] = temp;
        }


    }

    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop){


        int n = tab.length;
        int[] tab2 = new int[indeksStop-indeksStart+1];

        for(int i=indeksStart, j=0; i<=indeksStop; i++){
            tab2[j] = tab[i];
            j++;

        }

        odwrocTablice(tab2);



        for(int i=indeksStart, j=0; i<=indeksStop; i++){
            tab[i] = tab2[j];
            j++;

        }


    }













    public static void main(String[] args) {
        int[] tab = generujTablice(5,0,9);
        //int[] tab2 = najdluzszyCiagUjemnych(tab);
        //tab.toString();
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }

        System.out.println(" ");

        odwrocTablice(tab,0,2);
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }






    }
}
