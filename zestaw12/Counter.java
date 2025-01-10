
//zad3,12,14


package zestaw12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Counter<T> {

    List<T> lista = new ArrayList<>();

    public void add(T element){
        lista.add(element);
    }

    public int getCount(){
        return lista.size();
    }

    public static <T> void swap(T[] tablica,int i, int j){

        if(i >= tablica.length || j >= tablica.length){
            throw new IllegalArgumentException("indeks poza zasięgiem");
        }
        T temp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temp;
    }

    public static <T extends Comparable<T>> T minValue(T[] tablica){

        Arrays.sort(tablica);

        return tablica[0];

    }




    public static void main(String[] args) {

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("jablko");
        stringCounter.add("gruszka");
        //System.out.println(stringCounter.getCount());

        Counter<Integer> integerCounter = new Counter<>();
        integerCounter.add(1);
        integerCounter.add(2);
        integerCounter.add(3);
        //System.out.println(integerCounter.getCount());

        Integer[] tablica = {8,3,6,2,5};
        //System.out.println(tablica[1]);
        //System.out.println(tablica[3]);
        //swap(tablica,1,3);
        //System.out.println(tablica[1]);
        //System.out.println(tablica[3]);
        System.out.println(minValue(tablica));



        Character[] tablica2 ={'g','b','i'};
        //System.out.println(tablica2[0]);
        //System.out.println(tablica2[2]);
        //swap(tablica2,0,2);
        //System.out.println(tablica2[0]);
        //System.out.println(tablica2[2]);
        System.out.println(minValue(tablica2));




    }


}
