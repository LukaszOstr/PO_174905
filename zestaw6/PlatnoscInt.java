package zestaw6;

public interface PlatnoscInt {
    int PLATNOSCI = 346;
    void zaplac();

    default void platnosci(){
        System.out.println("Platnosci: " + PLATNOSCI);
    }

}
