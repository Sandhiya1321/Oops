package cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{3,6,7,8,9};
    }
    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        //Shallow Copying
//        return super.clone();
//    }
@Override
public Object clone() throws CloneNotSupportedException{
    //Deep Copying
    Human twin=(Human) super.clone();//shallow
    //Deep
    twin.arr=new int[twin.arr.length];
    for (int i = 0; i < twin.arr.length; i++) {
        twin.arr[i]=this.arr[i];
    }
    return twin;
}
}
