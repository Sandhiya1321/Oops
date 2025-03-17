public class Person {
    String name;
    int age;
    boolean isdestroyed=false;

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
        this.isdestroyed=false;
    }
    public void destroy() {
        this.isdestroyed = true;
        System.out.println("Object destroyed");
    }
    public void displayPerson() {
        if (!isdestroyed) {
            System.out.println("Name: " + name + ", Age: " + age);
        } else {
            System.out.println("Object is destroyed and cannot be used");
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("sandy", 20);
        person1.displayPerson();
        person1.destroy();
        person1.displayPerson();
    }
}
