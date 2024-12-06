package zestaw6;

public interface AdresInt{
    String KOD ="11-042";


    void pokaz();
    boolean przed(Adres adres);

    default void kod(){
        System.out.println("kod: " + KOD);
    }


}
