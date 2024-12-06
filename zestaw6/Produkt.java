package zestaw6;

import java.util.Objects;

public class Produkt implements ProduktInt{
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;


    public Produkt(String nazwa, double cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;

    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void setNazwa(String nazwa) {
        if(nazwa != null){
            this.nazwa = nazwa;
        }

    }

    public double getCena() {
        return cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }


    @Override
    public void wyswietlInformacje(){
        System.out.println(nazwa);
        System.out.println(cena);
        System.out.println(iloscNaMagazynie);
        System.out.println();
    }

    @Override
    public String toString(){
        return nazwa + " " + cena + " " + iloscNaMagazynie;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.nazwa,this.cena);
    }


    @Override
    public boolean equals(Object obj) {
        if(this.getClass() == obj.getClass()){
            return this.nazwa.equals(((Produkt) obj).nazwa) && this.cena == ((Produkt) obj).cena;
        }
        else{
            return false;
        }
    }
}