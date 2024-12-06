package zestaw6;

import java.util.Objects;


public class Adres implements AdresInt {
    private String ulica;
    private int numerDomu;
    private int numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, int numerDomu,int numerMieszkania, String miasto, String kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if(kodPocztowy != null){
            this.kodPocztowy = kodPocztowy;
        }

    }

    public void setMiasto(String miasto) {
        if(miasto != null){
            this.miasto = miasto;
        }

    }

    public void setNumerDomu(int numerDomu) {
        if(numerDomu > 0){
            this.numerDomu = numerDomu;
        }

    }

    public void setNumerMieszkania(int numerMieszkania) {
        if(numerMieszkania > 0){
            this.numerMieszkania = numerMieszkania;
        }

    }

    public void setUlica(String ulica) {
        if(ulica != null){
            this.ulica = ulica;
        }

    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }


    public String getMiasto() {
        return miasto;
    }

    public String getUlica() {
        return ulica;
    }


    @Override
    public void pokaz(){
        System.out.println(kodPocztowy + " " + miasto);
        if(numerMieszkania == 0){
            System.out.println(ulica + " " + numerDomu);

        }
        else{
            System.out.println(ulica + " " + numerDomu + " " + numerMieszkania);

        }

    }

    @Override
    public boolean przed(Adres adres){
        if(Objects.equals(this.kodPocztowy, adres.kodPocztowy)){
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        String napis = this.kodPocztowy + " " + miasto + " ";

        if(numerMieszkania == 0){
            napis += ulica + " " + numerDomu + " ";

        }
        else{
            napis += ulica + " " + numerDomu + " " + numerMieszkania + " ";

        }
        return  napis;
    }






}
