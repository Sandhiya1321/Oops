package pillars;
abstract class Car {
    abstract void startEngine();

    void SteeringWheel(String direction) {
        System.out.println("Car turning " + direction);
    }
}
class Tesla extends Car {
    @Override
    void startEngine() {
        System.out.println("Tesla's electric engine is starting...");
    }
}

 class CarTest {
    public static void main(String[] args) {
        Car myCar = new Tesla();
        myCar.startEngine();
        myCar.SteeringWheel("left");
    }
}
