package zestaw10.Comparable.zad12;


import java.util.ArrayList;
import java.util.Collections;

public class Order implements Comparable<Order>{

    String productName;
    int quantity;
    double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public int compareTo(Order o) {
        if(Double.compare(this.unitPrice,o.unitPrice) == 0){
            return this.quantity - o.quantity;
        }

        else {
            return -Double.compare(this.unitPrice,o.unitPrice);
        }
    }

    @Override
    public String toString() {
        return "{" +
                 productName + '\'' +
                ", " + quantity +
                ", " + unitPrice +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Order> lista = new ArrayList<>();

        lista.add(new Order("a",37,14.32));
        lista.add(new Order("b",34,12.32));
        lista.add(new Order("c",32,15.32));
        lista.add(new Order("d",33,14.32));

        Collections.sort(lista);

        System.out.println(lista);



    }


}
