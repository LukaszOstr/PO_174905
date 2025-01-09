package zestaw10.Interfejsy.zad15;

public class SoundTester {

    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        Radio radio = new Radio();

        musicPlayer.playSound();
        musicPlayer.stopSound();
        System.out.println();
        radio.playSound();
        radio.stopSound();
        System.out.println();
        System.out.println(SoundPlayer.getType());



    }

}
