package zestaw10.Interfejsy.zad11;

public class Dog implements DomesticAnimalSound{


    @Override
    public String makeHappySound() {
        return "Wag tail";
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
