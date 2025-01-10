package zestaw12;

public class Pair<T> {
    T firstObjekt;
    T secondObjekt;

    public Pair(T firstObjekt, T secondObjekt) {
        this.firstObjekt = firstObjekt;
        this.secondObjekt = secondObjekt;
    }

    public static <T extends Animal> int findMax(Pair<? extends Animal> pair){
        if(pair.firstObjekt.wiek > pair.secondObjekt.wiek){
            return pair.firstObjekt.wiek;
        }

        else{
            return pair.secondObjekt.wiek;
        }


    }

    public static <T> void findMinMaxAge(Dog[] tabDog, Pair<?super Dog> result){
        Dog min = new Dog(tabDog[0].wiek);
        Dog max = new Dog(tabDog[0].wiek);

        for (Dog dog : tabDog) {

            if (min.wiek > dog.wiek) {
                min = dog;
            }

            if (max.wiek < dog.wiek) {
                max = dog;
            }
        }

        result.firstObjekt = min;
        result.secondObjekt = max;


    }

    public static void main(String[] args) {

        Pair<Dog> pair = new Pair<>(new Dog(3),new Dog(2));

        Dog[] tabDog = {new Dog(6),new Dog(2),new Dog(9),new Dog(4)};

        findMinMaxAge(tabDog,pair);

        System.out.println(pair.firstObjekt.wiek);
        System.out.println(pair.secondObjekt.wiek);




    }


}
