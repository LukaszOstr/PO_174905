package zestaw6;

import java.util.Objects;

public class Adres {
    String ulica;
    int numerDomu;
    int numerMieszkania;
    String miasto;
    String kodPocztowy;

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

    public void pokaz(){
        System.out.println(kodPocztowy + " " + miasto);
        if(numerMieszkania == 0){
            System.out.println(ulica + " " + numerDomu);

        }
        else{
            System.out.println(ulica + " " + numerDomu + " " + numerMieszkania);

        }

    }

    public boolean przed(Adres adres){
        if(Objects.equals(this.kodPocztowy, adres.kodPocztowy)){
            return true;
        }
        return false;
    }







}
