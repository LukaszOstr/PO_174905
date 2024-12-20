import java.util.ArrayList;
import java.util.Objects;

public class kol1_174905 {

    public class Elf{
        private String imie;
        private int wiek;
        private String stanowisko;

        public Elf(String imie, int wiek, String stanowisko) {
            this.imie = imie;
            this.wiek = wiek;
            this.stanowisko = stanowisko;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {

            if(imie == null || imie.isEmpty()){
                System.out.println("Brak imienia");
                return;
            }

            this.imie = imie;
        }

        public int getWiek() {
            return wiek;
        }

        public void setWiek(int wiek) {
            if(wiek < 0){
                System.out.println("wiek nie może być ujemy");
                return;
            }
            this.wiek = wiek;
        }

        public String getStanowisko() {
            return stanowisko;
        }

        public void setStanowisko(String stanowisko) {
            if(stanowisko == null || stanowisko.isEmpty()){
                System.out.println("Brak stanowiska");
                return;
            }

            this.stanowisko = stanowisko;
        }

        public void przedstawSie(){
            System.out.println("Cześć, nazywam się " + imie + " ,mam " + wiek + " lat, " +
                    "a moje stanowisko pracy to " + stanowisko);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Elf elf = (Elf) o;
            return wiek == elf.wiek && Objects.equals(imie, elf.imie) && Objects.equals(stanowisko, elf.stanowisko);
        }

        @Override
        public int hashCode() {
            return Objects.hash(imie, wiek, stanowisko);
        }

        @Override
        public String toString() {
            return "Elf{" +
                    "imie='" + imie + '\'' +
                    ", wiek=" + wiek +
                    ", stanowisko='" + stanowisko + '\'' +
                    '}';
        }

    }

    public class Fabryka{
        private ArrayList<Elf> elfy;
        private int dlGeo;
        private int szGeo;

        public Fabryka(ArrayList<Elf> elfy, int dlGeo, int szGeo) {
            this.elfy = elfy;
            this.dlGeo = dlGeo;
            this.szGeo = szGeo;
        }

        public ArrayList<Elf> getElfy() {
            return elfy;
        }

        public void setElfy(ArrayList<Elf> elfy) {

            if(elfy == null || elfy.isEmpty()){
                System.out.println("Brak elfów");
                return;
            }

            this.elfy = elfy;
        }

        public int getDlGeo() {
            return dlGeo;
        }

        public void setDlGeo(int dlGeo) {

            if(dlGeo <= -180 || dlGeo >= 180){
                System.out.println("nieprawidłowa długość geograficzna");
                return;
            }

            this.dlGeo = dlGeo;
        }

        public int getSzGeo() {
            return szGeo;
        }

        public void setSzGeo(int szGeo) {

            if(dlGeo <= -90 || dlGeo >= 90){
                System.out.println("nieprawidłowa szerokość geograficzna");
                return;
            }

            this.szGeo = szGeo;
        }

        public void dodajPracownika(Elf elf){
            elfy.add(elf);
        }

        public void usunPracownika(Elf elf){
            elfy.remove(elf);
        }

        public Elf najstarszyPracownik(){
            Elf najstarszy = elfy.getFirst();
            for(int i=1; i<elfy.size();i++){
                if(elfy.get(i).wiek > najstarszy.wiek ){
                    najstarszy = elfy.get(i);
                }
            }
            return najstarszy;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fabryka fabryka = (Fabryka) o;
            return dlGeo == fabryka.dlGeo && szGeo == fabryka.szGeo && Objects.equals(elfy, fabryka.elfy);
        }

        @Override
        public int hashCode() {
            return Objects.hash(elfy, dlGeo, szGeo);
        }

        @Override
        public String toString() {
            return "Fabryka{" +
                    "elfy=" + elfy +
                    ", dlGeo=" + dlGeo +
                    ", szGeo=" + szGeo +
                    '}';
        }
    }

    public class Renifer{
        private String imie;
        private int predkosc;

        public Renifer(String imie, int predkosc) {
            this.imie = imie;
            this.predkosc = predkosc;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            if(imie == null || imie.isEmpty()){
                System.out.println("Brak imienia");
                return;
            }
            this.imie = imie;
        }

        public int getPredkosc() {
            return predkosc;
        }

        public void setPredkosc(int predkosc) {
            if(predkosc < 0){
                System.out.println("Prędkość nie może być ujemna");
                return;
            }
            this.predkosc = predkosc;
        }

        public void nakarmRenifera(){
            predkosc += 5;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Renifer renifer = (Renifer) o;
            return predkosc == renifer.predkosc && Objects.equals(imie, renifer.imie);
        }

        @Override
        public int hashCode() {
            return Objects.hash(imie, predkosc);
        }

        @Override
        public String toString() {
            return "Renifer{" +
                    "imie='" + imie + '\'' +
                    ", predkosc=" + predkosc +
                    '}';
        }

    }

    public class Sanie{
        private ArrayList<Renifer> renifery;

        public Sanie(ArrayList<Renifer> renifery) {
            this.renifery = renifery;
        }

        public ArrayList<Renifer> getRenifery() {
            return renifery;
        }

        public void setRenifery(ArrayList<Renifer> renifery) {

            if(renifery == null || renifery.isEmpty()){
                System.out.println("Brak reniferów");
                return;
            }

            this.renifery = renifery;
        }

        public void dodajRenifera(Renifer renifer){
            renifery.add(renifer);
        }

        public int sumaPredkosci(){
            int suma=0;
            for(int i=0; i<renifery.size();i++){
                suma+=renifery.get(i).predkosc;
            }
            return suma;
        }

        public Renifer najwolniejszyRenifer(){
            Renifer najwolniejszy = renifery.getFirst();

            for(int i=1; i<renifery.size();i++){
                if(renifery.get(i).predkosc < najwolniejszy.predkosc){
                    najwolniejszy = renifery.get(i);
                }
            }
            return najwolniejszy;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Sanie sanie = (Sanie) o;
            return Objects.equals(renifery, sanie.renifery);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(renifery);
        }

        @Override
        public String toString() {
            return "Sanie{" +
                    "renifery=" + renifery +
                    '}';
        }
    }
}
