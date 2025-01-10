package zestaw12;

import java.util.List;

public class zad21 {



    public static <T extends Animal> T findMax(T element1,T element2){
        if(element1.wiek > element2.wiek){
            return element1;
        }

        else {
            return element2;
        }

    }

    public static void main(String[] args) {
        Animal animal = new Animal(3);
        animal.wiek = 2;
        Dog dog = new Dog(4);
        dog.wiek = 8;

        System.out.println(findMax(animal,dog).wiek);



    }





}
