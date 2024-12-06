package zestaw6;

abstract class UrzadzenieElektryczne extends ProduktPrzemyslowy{
    public UrzadzenieElektryczne(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    abstract public void napraw();
    abstract public void uzyj();
    abstract public void wlacz();
    abstract public void wylacz();



}
