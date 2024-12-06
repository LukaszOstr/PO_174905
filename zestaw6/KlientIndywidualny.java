package zestaw6;

public class KlientIndywidualny extends Klient{
    final String PESEL;

    public KlientIndywidualny(String imie, String nazwisko, Zamowienie zamowienie, Adres adres, String pesel) {
        super(imie, nazwisko, zamowienie, adres);
        this.PESEL = pesel;
    }
}
