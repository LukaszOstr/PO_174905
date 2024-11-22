public class zestaw6 {







    public static void main(String[] args) {
        Produkt jablka = new Produkt("jablka",2.99,100);
        Produkt gruszki = new Produkt("gruszki",1.64, 32);
        jablka.dodajDoMagazynu(1000);
        gruszki.dodajDoMagazynu(1000);


        KoszykZakupowy koszyk = new KoszykZakupowy(jablka);
        //koszyk.wyswietlZawartoscKoszyka();
        //System.out.println(koszyk.obliczCalkowitaWartosc());
        koszyk.dodajProdukt(gruszki,7);
        //System.out.println(koszyk.obliczCalkowitaWartosc());
        koszyk.dodajProdukt(jablka,7);
        koszyk.dodajProdukt(gruszki,19);
        koszyk.dodajProdukt(jablka,42);

        Zamowienie zam = new Zamowienie(koszyk, "w drodze");




        KoszykZakupowy koszyk2 = new KoszykZakupowy(gruszki);
        koszyk.dodajProdukt(gruszki,7);
        //System.out.println(koszyk.obliczCalkowitaWartosc());
        koszyk2.dodajProdukt(jablka,100);
        koszyk2.dodajProdukt(gruszki,200);
        koszyk2.dodajProdukt(jablka,10);
        //koszyk.wyswietlZawartoscKoszyka();
        //koszyk2.wyswietlZawartoscKoszyka();

        Zamowienie zam2 = new Zamowienie(koszyk2,"gotowe");
        zam.wyswietlZamowienie();
        zam2.wyswietlZamowienie();

        Klient klient = new Klient("Adam", "Kowalski",zam);
        klient.dodajZamowienie(zam2);
        klient.wyswietlHistorieZamowien();
        System.out.println(klient.obliczLacznyKosztZamowien());






    }


}

