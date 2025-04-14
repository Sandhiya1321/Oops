package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sandy = new Human(20, "sandy");
        //Human twin=new Human(sandy);
        Human twin = (Human) sandy.clone();
        System.out.println(twin.age+" "+twin.name);
    }
}
