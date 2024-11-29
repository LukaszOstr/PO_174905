package zestaw6;

import java.util.ArrayList;
import java.util.Objects;

public class Sklep {

    ArrayList<Produkt> produkty = new ArrayList<>();

    public Sklep(Produkt prod){
        this.produkty.add(prod);
    }

    public void dodajProdukt(Produkt nowyProd){

        for(int i=0; i<this.produkty.size();i++){
            if(Objects.equals(this.produkty.get(i).nazwa, nowyProd.nazwa)){
                this.produkty.get(i).iloscNaMagazynie += nowyProd.iloscNaMagazynie;
                return;
            }
        }

        
        this.produkty.add(nowyProd);
    }

    public void wyswietlOferty(){
        for(int i=0; i<this.produkty.size(); i++){
            Produkt prod = this.produkty.get(i);
            System.out.println(prod.nazwa + " " + prod.cena);
        }
    }




}
