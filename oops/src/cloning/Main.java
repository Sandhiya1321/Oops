package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sandy = new Human(20, "sandy");
        //Human twin=new Human(sandy);
        Human twin = (Human) sandy.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(sandy.arr));
    }
}
