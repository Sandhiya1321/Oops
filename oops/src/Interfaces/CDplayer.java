package Interfaces;

public class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("I play music");
    }

    @Override
    public void stop() {
        System.out.println("I stop music");
    }
}
