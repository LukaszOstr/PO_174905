package zestaw6;

import java.security.Principal;
import java.util.ArrayList;

public class KoszykZakupowy implements KoszykZakupowyInt {


    private ArrayList<Produkt> listaProduktow;
    private int[] ilosc;


    public KoszykZakupowy(ArrayList<Produkt> produkty){
        this.listaProduktow = produkty;
        ilosc = new int[produkty.size()];


        for(int i=0; i< ilosc.length; i++){
            this.ilosc[i] = 0;
        }
    }

    public void setIlosc(int[] ilosc) {
        if(ilosc != null){
            this.ilosc = ilosc;
        }
    }

    public void setListaProduktow(ArrayList<Produkt> listaProduktow) {
        if(listaProduktow != null){
            this.listaProduktow = listaProduktow;
        }

    }

    public int[] getIlosc() {
        return ilosc;
    }

    public ArrayList<Produkt> getListaProduktow() {
        return listaProduktow;
    }

    @Override
    public void dodajProdukt(Produkt produkt, int ilosc){

        if(produkt.getIloscNaMagazynie() >= ilosc){
            int i;
            for(i=0;this.listaProduktow.get(i)!=produkt;i++){

            }
            this.ilosc[i] += ilosc;
            produkt.setIloscNaMagazynie(produkt.getIloscNaMagazynie()-ilosc);

        }

    }


    @Override
    public double obliczCalkowitaWartosc(){


        double cena = 0;


        for(int i=0; i<this.listaProduktow.size(); i++){
            cena += listaProduktow.get(i).getCena() * ilosc[i];

        }
        return cena;
    }



    @Override
    public String toString(){
        StringBuilder napis = new StringBuilder();


        for(int i=0; i<this.listaProduktow.size(); i++){
            Produkt prod = this.listaProduktow.get(i);
            napis.append(prod.getNazwa()).append(" ").append(this.ilosc[i]).append(" ");

        }

        return napis.toString();

    }
}
