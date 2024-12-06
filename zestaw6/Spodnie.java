package zestaw6;

public class Spodnie extends Ubranie{

    boolean wyprane;
    boolean zalozone;
    boolean wyprasowne;
    boolean wysuszone;
    boolean zniszczone;



    public Spodnie(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
        wyprane=false;
        zalozone=false;
        wyprasowne=false;
        wysuszone=false;
        zniszczone=false;
    }

    public boolean isWyprane() {
        return wyprane;
    }

    public void setWyprane(boolean wyprane) {
        this.wyprane = wyprane;
    }

    public boolean isZalozone() {
        return zalozone;
    }

    public void setZalozone(boolean zalozone) {
        this.zalozone = zalozone;
    }

    public boolean isWyprasowne() {
        return wyprasowne;
    }

    public void setWyprasowne(boolean wyprasowne) {
        this.wyprasowne = wyprasowne;
    }

    public boolean isWysuszone() {
        return wysuszone;
    }

    public void setWysuszone(boolean wysuszone) {
        this.wysuszone = wysuszone;
    }

    public boolean isZniszczone() {
        return zniszczone;
    }

    public void setZniszczone(boolean zniszczone) {
        this.zniszczone = zniszczone;
    }

    @Override
    public void wypierz() {
        wyprane=true;
        zalozone=false;
        wyprasowne=false;
        wysuszone=false;
    }

    @Override
    public void zaloz() {
        zalozone=true;
    }

    @Override
    public void wyprasuj() {
        wyprasowne=true;
    }

    @Override
    public void wysusz() {
        wysuszone=true;
    }

    @Override
    public void zniszcz() {
        zniszczone=true;
    }
}
