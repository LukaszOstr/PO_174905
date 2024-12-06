package zestaw6;

public class Jablko extends Owoc{
    String smak;
    boolean umyte;
    boolean zjedzone;



    public Jablko(String nazwa, double cena, int iloscNaMagazynie, String smak) {
        super(nazwa, cena, iloscNaMagazynie);
        this.smak = smak;
        umyte = false;
        zjedzone = false;
    }

    public String getSmak() {
        return smak;
    }

    public void setSmak(String smak) {
        this.smak = smak;
    }

    public boolean isUmyte() {
        return umyte;
    }

    public void setUmyte(boolean umyte) {
        this.umyte = umyte;
    }

    public boolean isZjedzone() {
        return zjedzone;
    }

    public void setZjedzone(boolean zjedzone) {
        this.zjedzone = zjedzone;
    }

    @Override
    public String smak() {
        return smak;
    }

    @Override
    public void umyj() {
        umyte = true;
    }

    @Override
    public void zjedz() {
        zjedzone = true;
    }
}
