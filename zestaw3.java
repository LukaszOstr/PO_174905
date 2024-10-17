//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class zestaw3 {




    static void trojkiPitagorejskie(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                for(int k=1; k<=j; k++){
                    if(Math.pow(k,2) + Math.pow(j,2) == Math.pow(i,2)){
                        System.out.println(k + " " + j + " " + i);

                    }
                }


            }
        }
    }

    static void funKwaRozwiazania(int n){
        //ax2 + bx + c
        // b2 - 4ac
        for(int a=1; a<=n; a++){
            for(int b=0; b<=n; b++){
                for(int c=0; c<=n; c++){
                    if(b*b - 4 * a * c > 0){
                        System.out.println(a + " " + b + " " + c);
                    }
                }


            }
        }

    }

    static void funKwaDelta(int n){
        for(int a=1; a<=n; a++){
            for(int b=0; b<=n; b++){
                for(int c=0; c<=n; c++){
                    if(Math.floor(Math.pow(b*b - 4 * a * c, 0.25)) == Math.pow(b*b - 4 * a * c, 0.25)){
                        System.out.println(a + " " + b + " " + c);
                    }
                }


            }
        }
    }

    static void liczbyPierwsze(int n){

        for(int i=2; i<=n; i++){
            boolean pierwsza = true;
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    pierwsza = false;
                    break;
                }
            }
            if(pierwsza){
                System.out.println(i);
            }
        }
    }

    static void liczbyPodzielne(int m, int n){
        for(double i =Math.pow(10,m); i < Math.pow(10,m+1); i++){
            if(i % n == 0){
                System.out.println(i);
            }
        }
    }

    static void piramida(int n, int variant){
        if(variant == 1){
            System.out.println("* ");
            for(int i=1;i<n;i++){
                //System.out.println("* ");
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println("* ");
            }
        }
        else if (variant == 2) {
            //int a = 2*n-1;
            for(int i=1; i<=n; i++){
                for(int j=1;j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println("");
            }


        }


    }

    static int silnia(int n){
        int silnia=1;
        for(int i=1;i<=n; i++){
            silnia *= i;
        }
        return silnia;
    }

    static void silniaPodwojna(int n){
        int silnia=1;
        if(n%2== 1){
            for(int i=1;i<=n; i=i+2){
                silnia *= i;
            }
            System.out.println(silnia);
        }
        else{
            for(int i=2;i<=n; i=i+2){
                silnia *= i;
            }
            System.out.println(silnia);
        }
    }

    static void silnia(int m, int n){
        int silnia=1;
        for(int i=n;i>=1; i=i-m){
            silnia *= i;
        }
        System.out.println(silnia);
    }

    static void dwumianNewtona(int n, int k){
        System.out.println(silnia(n) / (silnia(k) * silnia(n - k)));
    }

    static void ciagFibonacciego(int n){
        int fib1=1;
        int fib2=1;
        int fib3=1;

        if(n == 1){
            System.out.print("1");
        }
        else {
            System.out.print("1 1 ");

            for (int i = 3; i <= n; i++) {
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
                System.out.print(fib3 + " ");
            }
        }
    }

    static int sumaNaturalnych(int n){

        Scanner scan = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){
            int temp = scan.nextInt();
            if(temp<0){
                i--;
            }
            else{
                suma += temp;
            }

        }
        return suma;
    }

    static int sumaParzystych(int n){
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){
            int temp = scan.nextInt();
            if(temp%2==0){
                suma += temp;
            }
            else{
                i--;
            }

        }
        return suma;
    }

    static int sumaNieparzystych(int n){
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){
            int temp = scan.nextInt();
            if(temp%2==1){
                suma += temp;
            }
            else{
                i--;
            }

        }
        return suma;
    }

    static int sumaKwaNaturalnych(int n){

        Scanner scan = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){
            int temp = scan.nextInt();
            if(temp<0){
                i--;
            }
            else{
                suma += temp*temp;
            }

        }
        return suma;
    }

    static int sumaSzeNaturalnych(int n){

        Scanner scan = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){
            int temp = scan.nextInt();
            if(temp<0){
                i--;
            }
            else{
                suma += temp*temp*temp;
            }

        }
        return suma;
    }

    static double sumaOdwNaturalnych(int n){

        Scanner scan = new Scanner(System.in);
        double suma = 0;
        for(int i=1; i<=n; i++){
            int temp = scan.nextInt();
            if(temp<0){
                i--;
            }
            else{
                suma += (double) 1 / temp;
            }

        }
        return suma;
    }

    static boolean czyPalindrom(String wyraz){
        for(int i=0; i<=(wyraz.length())/2; i++){
            if(wyraz.charAt(i) != wyraz.charAt(wyraz.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    static boolean czyDoskonala(int n){
        int suma=0;

        for(int i=1;i<n;i++){
            if(n%i == 0){
                suma += i;
            }
        }
        if(suma == n){
            return true;
        }
        else{
            return false;
        }

    }

    static boolean czyPierwsza(int n){

        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    static int NWD(int a, int b){
        if(a > b){
            for(int i=a/2; i>0; i--){
                if(a%i == 0 && b%i == 0){
                    return i;
                }
            }
        }
        else if (b > a) {
            for(int i=b/2; i>0; i--){
                if(a%i == 0 && b%i == 0){
                    return i;
                }
            }
        }
        else {
            return a;
        }
        return 1;
    }

    static int[] wczytajTablice(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] tab = new int[n];

        for(int i=0; i<n; i++){
            int temp = scan.nextInt();
            tab[i] = temp;
        }
         return tab;

    }

    static void podzbiory(int[] tab){
        int n = tab.length;
        //System.out.print("pusty");
        for(int i=0; i < (1<<n); i++){
            System.out.print("{ ");
            for(int j=0; j < n; j++){
                if((i & (1 << j)) > 0){
                    System.out.print(tab[j] + " ");
                }

            }
            System.out.println("}");
        }


    }





    public static void main(String[] args) {
        //wczytajTablice();
        int[] w = {1, 2, 3};
        //System.out.print();
        podzbiory(w);


    }
}
