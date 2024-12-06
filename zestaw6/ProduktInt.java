package zestaw6;

public interface ProduktInt {
    int MAX_PRODUKTOW = 232324;
    void wyswietlInformacje();

    default void maxProduktow(){
        System.out.println("Max produktow: " + MAX_PRODUKTOW);
    }
}
