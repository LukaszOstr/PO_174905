package zestaw10.Interfejsy.zad17;

public interface VATCalculator {

    double vatRate = 0.23;

    static double calculateWithVAT(double price){
        return price + price * vatRate;
    }

}
