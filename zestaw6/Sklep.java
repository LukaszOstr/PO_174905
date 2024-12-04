package zestaw6;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Sklep {

    private ArrayList<Produkt> produkty = new ArrayList<>();
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(Produkt prod,String nazwaSklepu, LocalDate dataPowstania, Magazyn magazynSklepu){

        LocalDate data = LocalDate.now();
        if(dataPowstania.isBefore(data)){
            this.dataPowstania = dataPowstania;
        }
        else {
            System.out.println("Nieprawidlowa data");
            return;
        }
        this.produkty.add(prod);
        this.nazwaSklepu = nazwaSklepu;
        this.magazynSklepu = magazynSklepu;

    }


    public void setProdukty(ArrayList<Produkt> produkty){
        if(produkty != null){
            this.produkty = produkty;
        }

    }

    public void setNazwaSklepu(String nazwaSklepu){
        if(nazwaSklepu != null){
            this.nazwaSklepu = nazwaSklepu;

        }
    }

    public void setDataPowstania(LocalDate dataPowstania) {
        if(dataPowstania != null){
            this.dataPowstania = dataPowstania;
        }

    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if(magazynSklepu != null){
            this.magazynSklepu = magazynSklepu;
        }
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void dodajProdukt(Produkt nowyProd){

        for(int i=0; i<this.produkty.size();i++){
            if(Objects.equals(this.produkty.get(i).getNazwa(), nowyProd.getNazwa())){
                this.produkty.get(i).setIloscNaMagazynie(produkty.get(i).getIloscNaMagazynie()+1);
                return;
            }
        }

        
        this.produkty.add(nowyProd);
    }

    public void wyswietlOferty(){
        for(int i=0; i<this.produkty.size(); i++){
            Produkt prod = this.produkty.get(i);
            System.out.println(prod.getNazwa() + " " + prod.getCena());
        }
    }

    @Override
    public String toString(){
        return this.produkty + " " + this.magazynSklepu + " " + this.nazwaSklepu + " " + this.dataPowstania;
    }



}
