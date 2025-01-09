package zestaw10.Interfejsy.zad15;

public interface SoundPlayer {

    void playSound();

    default void stopSound(){
        System.out.println("Sound Stopped");
    }


    static String getType(){
        return "Sound Device";
    }



}
