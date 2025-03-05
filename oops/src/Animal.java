public class Animal {

public void makeSound(){
    System.out.println("animal sounds");
}
public static class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}

    public static void main(String[] args) {
    Animal ani=new Animal();
    ani.makeSound();
        Dog dog=new Dog();
        dog.makeSound();
    }
}
