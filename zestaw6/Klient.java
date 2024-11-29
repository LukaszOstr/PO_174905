package zestaw6;

import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien = new ArrayList<>();
    Adres adres;

    public Klient(String imie, String nazwisko, Zamowienie zamowienie, Adres adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien.add(zamowienie);
        this.adres = adres;
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        this.listaZamowien.add(zamowienie);
    }

    public void wyswietlHistorieZamowien(){
        for(int i=0;i<this.listaZamowien.size();i++){
            Zamowienie zam = this.listaZamowien.get(i);
            zam.wyswietlZamowienie();


        }
    }

    public double obliczLacznyKosztZamowien(){
        double koszt=0;
        for(int i=0;i<this.listaZamowien.size();i++){

            Zamowienie zam = this.listaZamowien.get(i);
            koszt += zam.koszykZakupowy.obliczCalkowitaWartosc();


        }

        return koszt;
    }


}
