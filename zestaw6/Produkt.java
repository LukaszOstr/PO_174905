package zestaw6;

public class Produkt{
    String nazwa;
    double cena;
    int iloscNaMagazynie;


    public Produkt(String nazwa, double cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;





    }

    public void wyswietlInformacje(){
        System.out.println(nazwa);
        System.out.println(cena);
        System.out.println(iloscNaMagazynie);
        System.out.println();
    }




}