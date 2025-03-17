class Parent {
    String name;
    int age;
    public Parent(String name,int age) {
        this.name = name;
        this.age=age;
    }
    public void show() {
        System.out.println("This is the Parent class");
    }
}
class Child extends Parent {
    public Child(String name, int age) {
        super(name, age);
    }
    @Override
    public void show() {
        System.out.println("This is the Child class");
    }
    public static void main(String[] args) {
        Parent parent = new Parent("xyz",50);
        parent.show();
        Child child = new Child("sandy",20);
        child.show();
        Parent Obj = new Child("sandy",20);
        Obj.show();
    }
}
