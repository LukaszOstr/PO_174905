package zestaw10.Comparable.zad21;

public class Company extends Client{

    private int numberOfEmployees;

    public Company(String lastName, double balance, int numberOfEmployees) {
        super(lastName, balance);
        this.numberOfEmployees = numberOfEmployees;
    }



    @Override
    public int compareTo(Client o) {

        if(o.getClass() != Company.class){
            throw new ClassCastException("Nie można porównać");
        }
        Company oCompany = (Company) o;

        int baseComparison = super.compareTo(oCompany);

        if(baseComparison != 0){
            return baseComparison;
        }

        return Integer.compare(this.numberOfEmployees, oCompany.numberOfEmployees);
    }

    @Override
    public String toString() {
        return "Company{" +
                "numberOfEmployees=" + numberOfEmployees +
                '}';
    }
}
