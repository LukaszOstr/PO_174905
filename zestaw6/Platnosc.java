public class Platnosc {

    double kwota;
    String statusPlatnosci;

    public Platnosc(int kwota, String statusPlatnosci){
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        this.kwota = 0;
    }
    


}
