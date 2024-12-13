package zestaw9;

import java.util.ArrayList;

record BookDTO(String title, String author, double price, int yearOfPublication){}

record Address(String street, int houseNumber, String postalCode, String city){}
record Person(String firstName, String lastName, int phoneNumber, Address address){}

record Car(String brand, String model, double fuelConsumptionPer100km){
    double fuelCost(double fuelPrice, double distance){
        return fuelConsumptionPer100km / 100 * distance * fuelPrice;
    }
}

record Person1(String imie, int wiek){

    public Person1{
        if(wiek < 0){
            wiek = 0;
        }
    }
}


public class zestaw9 {

    public static void main(String[] args) {
        //BookDTO lotr = new BookDTO("LOTR", "J.R.R. Tolkien",49.99,1948);
        //BookDTO bssd = new BookDTO("dfgd", "kfjkfg",100.32,1329);

        //Address adres = new Address("Kwiatowa",123,"11-042","Olsztym");

        //Person test = new Person("Jan","Kowalski",373239363,adres);

        //Car car = new Car("Volvo","sdhg", 4);

        //Person1 test1 = new Person1("asda",23);




        RockAlbum rock = new RockAlbum("abc","efg", new ArrayList<Double>(), "lmn");
        rock.addRating(3.21);
        rock.addRating(1.96);
        rock.addRating(4.21);
        System.out.println(rock.getRatings());
        rock.deleteRating(1);
        System.out.println(rock.getRatings());
        System.out.println(rock);







    }

}
