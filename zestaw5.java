import java.util.ArrayList;
import java.util.Arrays;

public class zestaw5 {

    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> tab = new ArrayList<Integer>();
        for(int i=0;i<tab1.size();i++){
            tab.add(tab1.get(i));
        }


        for(int i=0;i<tab2.size();i++){
            tab.add(tab2.get(i));
        }
        return tab;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){

        ArrayList<Integer> tab = new ArrayList<Integer>();

        int i,j,k;
        for(i=0,j=0,k=0;i<tab1.size()+tab2.size() && j<tab1.size() && k < tab2.size();i++){

            if(i%2 == 0){
                tab.add(tab1.get(j));
                j++;
            }

            else if(i%2 == 1){
                tab.add(tab2.get(k));
                k++;
            }

        }

        while(j<tab1.size()){
            tab.add(tab1.get(j));
            j++;

        }

        while(k<tab2.size()){
            tab.add(tab2.get(k));
            k++;
        }




        return tab;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2){

        ArrayList<Integer> tab = merge(tab1,tab2);
        tab.sort(null);



        return tab;
    }

    public static ArrayList<Character> toArrayList(String napis){

        ArrayList<Character> tab = new ArrayList<Character>();

        char[] temp = new char[napis.length()];
        napis.getChars(0,napis.length(),temp,0);

        for(int i=0;i<temp.length;i++){
            tab.add(temp[i]);
        }
        tab.sort(null);

        return tab;
    }

    public static ArrayList<Integer> toArrayList(int liczba){
        ArrayList<Integer> tab = new ArrayList<>();
        String napis = String.valueOf(liczba);

        char[] temp = new char[napis.length()];
        napis.getChars(0,napis.length(),temp,0);

        for(int i=0;i<temp.length;i++){
            tab.add(temp[i] - '0');
        }
        tab.sort(null);

        return tab;

    }

    public static boolean checkChar(ArrayList<String> tab, char znak){

        for(int i=0;i<tab.size();i++){
            String napis = tab.get(i);
            ArrayList<Character> temp = toArrayList(napis);
            if(temp.contains(znak)){
                return true;
            }

        }
        return false;

    }

    public static boolean checkDigit(ArrayList<Integer> tab, int cyfra){

        for(int i=0;i<tab.size();i++){
            int napis = tab.get(i);
            ArrayList<Integer> temp = toArrayList(napis);
            if(temp.contains(cyfra)){
                return true;
            }

        }
        return false;

    }

    public static int countChar(ArrayList<String> tab, char znak){

        int suma = 0;

        for(int i=0;i<tab.size();i++){
            String napis = tab.get(i);
            ArrayList<Character> temp = toArrayList(napis);
            for(int j=0;j<temp.size();j++){
                if(temp.get(j) == znak){
                    suma++;
                }
            }

        }


        return suma;
    }

    public static int countDigit(ArrayList<Integer> tab, int cyfra){

        int suma=0;


        for(int i=0;i<tab.size();i++){
            int napis = tab.get(i);
            ArrayList<Integer> temp = toArrayList(napis);
            for(int j=0;j<temp.size();j++){
                if(temp.get(j) == cyfra){
                    suma++;
                }
            }

        }
        return suma;

    }

    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab){
        ArrayList<ArrayList<Integer>> new_tab = new ArrayList<>();

        for(int i=0; i<tab.size();i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(tab.get(i));
            temp.add(0);
            if(!new_tab.contains(temp)){
                new_tab.add(temp);
            }
        }

        return new_tab;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(8);
        tab1.add(2);
        tab1.add(1);
        tab1.add(1);
        tab1.add(3);
        tab1.add(8);


        System.out.println(tab1);
        System.out.println(uniqueArrayList(tab1));





    }

}

