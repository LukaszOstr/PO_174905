package zestaw6;

public class KlientFirmowy extends Klient{
    final String NIP;
    final String REGON;

    public KlientFirmowy(String imie, String nazwisko, Zamowienie zamowienie, Adres adres, String nip, String regon) {
        super(imie, nazwisko, zamowienie, adres);
        this.NIP = nip;
        this.REGON = regon;
    }
}
