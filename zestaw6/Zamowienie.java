package zestaw6;

public class Zamowienie {

    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;

    public Zamowienie(KoszykZakupowy koszyk, String status){
        this.koszykZakupowy = koszyk;
        this.statusZamowienia = status;
    }

    public void ustawStatusZamowienia(String nowyStatus){
        this.statusZamowienia = nowyStatus;
    }

    public void wyswietlZamowienie(){
        this.koszykZakupowy.wyswietlZawartoscKoszyka();

        System.out.println("Status: " + this.statusZamowienia);
        System.out.println();
    }


}
