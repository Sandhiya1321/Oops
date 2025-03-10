abstract class Vehicle {
    public abstract void start();
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine started!");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike engine started!");
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.start();
        myBike.start();
}
}