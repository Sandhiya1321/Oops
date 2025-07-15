package pillars;

class Dog {
    private String name;
    private String breed;
    private int age;
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void bark() {
        System.out.println(name + " is barking!");
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever", 3);
        myDog.displayInfo();
        myDog.bark();
    }
}
