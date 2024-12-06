package zestaw6;

import java.util.Objects;

public class Platnosc implements PlatnoscInt {

    private double kwota;
    private String statusPlatnosci;

    public Platnosc(int kwota, String statusPlatnosci){
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public void setKwota(double kwota) {
        if(kwota >= 0){
            this.kwota = kwota;
        }

    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if(statusPlatnosci != null){
            this.statusPlatnosci = statusPlatnosci;
        }

    }

    public double getKwota() {
        return kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    @Override
    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        this.kwota = 0;
    }

    @Override
    public String toString(){
        return kwota + " " + statusPlatnosci;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.kwota,this.statusPlatnosci);
    }


    @Override
    public boolean equals(Object obj) {
        if(this.getClass() == obj.getClass()){
            return this.statusPlatnosci.equals(((Platnosc) obj).statusPlatnosci) && this.kwota == ((Platnosc) obj).kwota;
        }
        else{
            return false;
        }

    }
}
