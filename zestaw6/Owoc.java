package zestaw6;

abstract class Owoc extends  ProduktSpozywczy{
    public Owoc(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    abstract public String smak();
    abstract public void umyj();
    abstract public void zjedz();

}
