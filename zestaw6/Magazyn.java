package zestaw6;

import java.util.ArrayList;
import java.util.Objects;

public class Magazyn implements MagazynInt {

    private ArrayList<Produkt> produkty = new ArrayList<>();
    private int[] ilosc;

    public Magazyn(ArrayList<Produkt> produkty){
        this.produkty = produkty;
        ilosc = new int[produkty.size()];


        for(int i=0; i< ilosc.length; i++){
            this.ilosc[i] = produkty.get(i).getIloscNaMagazynie();
        }

    }

    public void setIlosc(int[] ilosc) {
        if(ilosc != null){
            this.ilosc = ilosc;
        }

    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        if(produkty != null){
            this.produkty = produkty;
        }

    }

    public int[] getIlosc() {
        return ilosc;
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    @Override
    public void wyswietlAsortyment(){
        for(int i=0; i<produkty.size(); i++){
            System.out.println(produkty.get(i).getNazwa() + " " + ilosc[i]);
        }
    }

    @Override
    public void dodajDoMagazynu(Produkt prod,int ilosc){
        prod.setIloscNaMagazynie(prod.getIloscNaMagazynie() + ilosc);

        int i;

        for(i = 0; !Objects.equals(this.produkty.get(i).getNazwa(), prod.getNazwa()); i++){

        }

         this.ilosc[i] += ilosc;

    }

    @Override
    public void usunZMagazynu(Produkt prod, int ilosc){
        if(ilosc <= prod.getIloscNaMagazynie()){
            prod.setIloscNaMagazynie(prod.getIloscNaMagazynie() - ilosc);

            int i;

            for(i = 0; !Objects.equals(this.produkty.get(i).getNazwa(), prod.getNazwa()); i++){

            }

            this.ilosc[i] -= ilosc;

        }

    }
    @Override
    public String toString(){
        String napis="";
        for(int i=0; i<produkty.size(); i++){
            napis += produkty.get(i).getNazwa() + " " + ilosc[i]+ " ";
        }
        return napis;
    }








}
