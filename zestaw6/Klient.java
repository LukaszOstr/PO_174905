package zestaw6;

import java.util.ArrayList;
import java.util.Objects;

public class Klient extends Osoba implements KlientInt {
    //private String imie;
    //private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien = new ArrayList<>();
    private Adres adres;

    public Klient(String imie, String nazwisko, Zamowienie zamowienie, Adres adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien.add(zamowienie);
        this.adres = adres;
    }

    public void setAdres(Adres adres) {
        if(adres != null){
            this.adres = adres;
        }
        throw new IllegalArgumentException("blad");
    }

    public void setImie(String imie) {
        if(imie != null){
            this.imie = imie;
        }
        throw new IllegalArgumentException("blad");
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        if(listaZamowien != null){
            this.listaZamowien = listaZamowien;
        }
        throw new IllegalArgumentException("blad");
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko != null){
            this.nazwisko = nazwisko;
        }
        throw new IllegalArgumentException("blad");
    }

    public Adres getAdres() {
        return adres;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;

    }

    @Override
    public void dodajZamowienie(Zamowienie zamowienie){
        this.listaZamowien.add(zamowienie);
    }

    @Override
    public void wyswietlHistorieZamowien(){
        for(int i=0;i<this.listaZamowien.size();i++){
            Zamowienie zam = this.listaZamowien.get(i);
            System.out.println(zam);


        }
    }

    @Override
    public double obliczLacznyKosztZamowien(){
        double koszt=0;
        for(int i=0;i<this.listaZamowien.size();i++){

            Zamowienie zam = this.listaZamowien.get(i);
            koszt += zam.getKoszykZakupowy().obliczCalkowitaWartosc();


        }

        return koszt;
    }

    @Override
    public String toString(){
        return this.imie + " " + this.nazwisko + " " + this.listaZamowien + " " + this.adres;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.imie,this.nazwisko, this.adres);
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getClass() == obj.getClass()){
            return this.imie.equals(((Klient) obj).imie) && this.nazwisko.equals(((Klient) obj).nazwisko) && this.adres.equals(((Klient) obj).adres);
        }
        else{
            return false;
        }

    }


}
