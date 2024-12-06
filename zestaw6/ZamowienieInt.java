package zestaw6;

public interface ZamowienieInt {
    int ZAMOWIENIA = 24566;
    void ustawStatusZamowienia(String nowyStatus);

    default void zamowienia(){
        System.out.println("zamowienia: " + ZAMOWIENIA);
    }
}
