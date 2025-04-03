package Interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("I start like electric engine car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like electric engine car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like electric engine car");
    }
}
