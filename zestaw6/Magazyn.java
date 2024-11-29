package zestaw6;

import java.util.ArrayList;
import java.util.Objects;

public class Magazyn {

    public ArrayList<Produkt> produkty = new ArrayList<>();
    public int[] ilosc;

    public Magazyn(ArrayList<Produkt> produkty){
        this.produkty = produkty;
        ilosc = new int[produkty.size()];


        for(int i=0; i< ilosc.length; i++){
            this.ilosc[i] = produkty.get(i).iloscNaMagazynie;
        }

    }





    public void wyswietlAsortyment(){
        for(int i=0; i<produkty.size(); i++){
            System.out.println(produkty.get(i).nazwa + " " + ilosc[i]);
        }
    }

    public void dodajDoMagazynu(Produkt prod,int ilosc){
        prod.iloscNaMagazynie += ilosc;

        int i;

        for(i = 0; !Objects.equals(this.produkty.get(i).nazwa, prod.nazwa); i++){

        }

         this.ilosc[i] += ilosc;



    }

    public void usunZMagazynu(Produkt prod, int ilosc){
        if(ilosc <= prod.iloscNaMagazynie){
            prod.iloscNaMagazynie -= ilosc;

            int i;

            for(i = 0; !Objects.equals(this.produkty.get(i).nazwa, prod.nazwa); i++){

            }

            this.ilosc[i] -= ilosc;

        }






    }










}
