package zestaw6;

public interface MagazynInt {
    int MAGAZYNY = 12039;
    void wyswietlAsortyment();
    void dodajDoMagazynu(Produkt prod,int ilosc);
    void usunZMagazynu(Produkt prod, int ilosc);

    default void magazyny(){
        System.out.println("Liczba magazynów: " + MAGAZYNY);
    }


}
