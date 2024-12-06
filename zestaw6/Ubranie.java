package zestaw6;

abstract class Ubranie extends ProduktPrzemyslowy{
    public Ubranie(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    abstract public void wypierz();
    abstract public void zaloz();
    abstract public void wyprasuj();
    abstract public void wysusz();
    abstract public void zniszcz();
}
