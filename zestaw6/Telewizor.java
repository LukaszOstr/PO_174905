package zestaw6;

public class Telewizor extends UrzadzenieElektryczne{
    boolean zepsute;
    boolean uzywane;
    boolean wlaczone;


    public Telewizor(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
        zepsute = false;
        uzywane = false;
        wlaczone = false;
    }

    public boolean isZepsute() {
        return zepsute;
    }

    public void setZepsute(boolean zepsute) {
        this.zepsute = zepsute;
    }

    public boolean isUzywane() {
        return uzywane;
    }

    public void setUzywane(boolean uzywane) {
        this.uzywane = uzywane;
    }

    public boolean isWlaczone() {
        return wlaczone;
    }

    public void setWlaczone(boolean wlaczone) {
        this.wlaczone = wlaczone;
    }

    @Override
    public void napraw() {
        zepsute = false;
    }

    @Override
    public void uzyj() {
        uzywane = true;
    }

    @Override
    public void wlacz() {
        wlaczone = true;
    }

    @Override
    public void wylacz() {
        wlaczone = false;
    }
}
