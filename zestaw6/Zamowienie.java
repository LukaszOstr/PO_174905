package zestaw6;

public class Zamowienie {

    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;

    public Zamowienie(KoszykZakupowy koszyk, String status){
        this.koszykZakupowy = koszyk;
        this.statusZamowienia = status;
    }

    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy){
        if(koszykZakupowy != null){
            this.koszykZakupowy = koszykZakupowy;
        }

    }

    public void setStatusZamowienia(String statusZamowienia){
        if(statusZamowienia != null){
            this.statusZamowienia = statusZamowienia;
        }
    }

    public KoszykZakupowy getKoszykZakupowy(){
        return this.koszykZakupowy;
    }

    public String getStatusZamowienia(){
        return this.statusZamowienia;
    }



    public void ustawStatusZamowienia(String nowyStatus){
        this.statusZamowienia = nowyStatus;
    }



    @Override
    public String toString(){
        return this.koszykZakupowy + " " + this.statusZamowienia;
    }


}
