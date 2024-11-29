package zestaw6;

import java.security.Principal;
import java.util.ArrayList;

public class KoszykZakupowy {

    ArrayList<Produkt> listaProduktow;
    int[] ilosc;

    public KoszykZakupowy(ArrayList<Produkt> produkty, int[] ilosc){
        this.listaProduktow = produkty;
        this.ilosc = ilosc;
    }

    public void dodajProdukt(Produkt produkt, int ilosc){

        while(ilosc > 0){

            if(produkt.iloscNaMagazynie > 0){
                produkt.iloscNaMagazynie--;

                this.listaProduktow.add(produkt);
                ilosc--;
            }
            else{
                System.out.println("Brak produktu");
                return;
            }
        }


    }

    public void wyswietlZawartoscKoszyka(){
        ArrayList<Produkt> temp = new ArrayList<>();

        for(int i=0; i<this.listaProduktow.size(); i++){
            Produkt prod = this.listaProduktow.get(i);
            if(!temp.contains(prod)) {
                temp.add(prod);

                System.out.println(prod.nazwa + " " + iloscProduktu(prod));

            }
        }
    }

    public double obliczCalkowitaWartosc(){

        ArrayList<Produkt> temp = new ArrayList<>();
        double cena = 0;

        for(int i=0; i<this.listaProduktow.size(); i++){
            Produkt prod = this.listaProduktow.get(i);

            if(!temp.contains(prod)) {
                temp.add(prod);
                cena += prod.cena * iloscProduktu(prod);


            }
        }
        return cena;
    }

    int iloscProduktu(Produkt produkt){
        int ilosc=0;

        for(int i=0; i<this.listaProduktow.size(); i++){
            if(listaProduktow.get(i) == produkt){
                ilosc++;
            }
        }

        return ilosc;
    }


}
