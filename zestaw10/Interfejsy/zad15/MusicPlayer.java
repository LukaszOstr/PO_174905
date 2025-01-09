package zestaw10.Interfejsy.zad15;

public class MusicPlayer implements SoundPlayer{

    @Override
    public void playSound() {
        System.out.println("Playing Music");
    }

    @Override
    public void stopSound() {
        SoundPlayer.super.stopSound();
    }
}
