import java.lang.reflect.Array;
import java.util.ArrayList;

public class kol1_gr1_174905 {



    public static boolean czyCiagArytmetyczny(int[] tab){

        if(tab.length == 0){
            return false;
        }


        if(tab.length <= 2){
            return true;
        }
        int r=tab[1] - tab[0];

        for(int i=2; i<tab.length; i++){
            if(tab[i] - tab[i-1] != r){
                return false;
            }
        }

        return true;

    }

    public static boolean czyCiagArytmetycznyM(int[] tab, int m){

        if(m == 1){
            return czyCiagArytmetyczny(tab);
        }
        int[] temp_tab = tab;


        for(int j=1; j<m; j++){
            int[] temp = new int[temp_tab.length-1];
            for(int i=0; i<temp.length; i++){
                temp[i] = temp_tab[i+1] - temp_tab[i];
            }

            temp_tab = temp;

        }

        return czyCiagArytmetyczny(temp_tab);





    }




    public static int podciag(int[] tab){
        int dl = 0;
        int dl_max=0;
        ArrayList<Integer> podciag = new ArrayList<>();


        if(tab.length == 1){

            return 1;
        }




        for(int i=0; i<tab.length; i++){
            if(podciag.isEmpty()){
                podciag.add(tab[i]);
                dl++;
            }

            else if(tab[i] > tab[i-1]){
                podciag.add(tab[i]);
                dl++;
            }
            else{

                if(dl > dl_max){
                    dl_max = dl;

                }

                podciag = new ArrayList<>();
                podciag.add(tab[i]);
                dl=1;
            }
        }

        return dl_max;

    }

    public static int podciag(int[] tab, int r){
        int dl = 0;
        int dl_max=0;
        ArrayList<Integer> podciag = new ArrayList<>();


        if(tab.length == 1){
            return 1;
        }


        for(int i=0; i<tab.length; i++){
            if(podciag.isEmpty()){
                podciag.add(tab[i]);
                dl++;
            }

            else if(tab[i] > tab[i-1] && tab[i] - tab[i-1] == r){
                podciag.add(tab[i]);
                dl++;
            }
            else{

                if(dl > dl_max){
                    dl_max = dl;

                }

                podciag = new ArrayList<>();
                podciag.add(tab[i]);
                dl=1;
            }
        }
        if(dl_max == 1){
            return 0;
        }
        return dl_max;

    }

    public static void sekwencjaCollatza(int n, int c){

        System.out.print(c);

        for(int i=1; i<n; i++){
            if(c % 2 == 0){
                c = c/2;
            }
            else{
                c = 3*c + 1;
            }
            System.out.print(" " + c);
        }

        System.out.println();

    }

    public static void minMaxsekwencjaCollatza(int n, int c){

        int min = c;
        int max = c;




        for(int i=1; i<n; i++){



            if(c % 2 == 0){
                c = c/2;
            }
            else{
                c = 3*c + 1;
            }

            if(c > max){
                max = c;
            }

            if(c < min){
                min = c;
            }


        }

        System.out.println("min=" + min);
        System.out.println("max=" + max);



    }






    public static void main(String[] args) {

        int[] ciag = {1,8,27,64,125};
        System.out.println(czyCiagArytmetyczny(ciag));
        System.out.println(czyCiagArytmetycznyM(ciag,3));

        int[] tab = {1,2,0,3,5,1,4};
        System.out.println(podciag(tab));
        System.out.println(podciag(tab,2));

        sekwencjaCollatza(10,12);
        minMaxsekwencjaCollatza(10,12);






    }

}
