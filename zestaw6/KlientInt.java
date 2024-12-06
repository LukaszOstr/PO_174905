package zestaw6;

public interface KlientInt {
    String STALY_KLIENT = "Adam Kowalski";


    void dodajZamowienie(Zamowienie zamowienie);
    void wyswietlHistorieZamowien();
    double obliczLacznyKosztZamowien();

    default void stalyKlient(){
        System.out.println("Staly klient: " + STALY_KLIENT);
    }
}
