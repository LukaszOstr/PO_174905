package zestaw6;

public interface KoszykZakupowyInt {
    int LICZBA_KOSZYKOW = 99;



    void dodajProdukt(Produkt produkt, int ilosc);
    double obliczCalkowitaWartosc();

    default void liczbaKoszykow(){
        System.out.println("Liczba koszykow: " + LICZBA_KOSZYKOW);
    }
}
