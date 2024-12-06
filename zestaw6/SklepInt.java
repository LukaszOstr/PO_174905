package zestaw6;

public interface SklepInt {
    int SKLEPY = 217613;
    void dodajProdukt(Produkt nowyProd);
    void wyswietlOferty();

    default void sklepy(){
        System.out.println("sklepy: " + SKLEPY);
    }


}
