package zestaw10.Comparable.zad21;

public class Client implements Comparable<Client>{

    private String lastName;
    private double balance;

    public Client(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }



    @Override
    public int compareTo(Client o) {

        if(Double.compare(this.balance,o.balance) == 0){
            return this.lastName.compareTo(o.lastName);
        }

        else{
            return Double.compare(this.balance,o.balance);
        }

    }

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }

}
