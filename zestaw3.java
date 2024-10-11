//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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






    public static void main(String[] args) {
        piramida(3,2);


    }
}
