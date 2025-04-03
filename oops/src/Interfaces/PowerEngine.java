package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start like power engine car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like power engine car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like power engine car");
    }
}
