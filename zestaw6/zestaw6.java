package zestaw6;

import java.util.ArrayList;

public class zestaw6 {






    public static void main(String[] args) {

        Produkt jablka = new Produkt("jablka",2.99,100);
        Produkt gruszki = new Produkt("gruszki",1.64, 32);
        ArrayList<Produkt> p = new ArrayList<>();
        p.add(jablka);
        p.add(gruszki);
        //System.out.println(p.getFirst());
        KoszykZakupowy koszykZakupowy = new KoszykZakupowy(p);




        //Magazyn magazyn = new Magazyn(p);
       // magazyn.dodajDoMagazynu(jablka,1000);
       // magazyn.dodajDoMagazynu(gruszki,1000);
       // magazyn.wyswietlAsortyment();

       // Adres adres = new Adres("abc",11,"olsztyn","11-042");
        //adres.pokaz();
        //System.out.println(koszykZakupowy);
        koszykZakupowy.dodajProdukt(jablka,7);
        koszykZakupowy.dodajProdukt(gruszki,5);
        //System.out.println(koszykZakupowy);


        System.out.println(jablka.getClass());



















    }


}

