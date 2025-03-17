public class   Grandparent {
    String name;
    int age;

    Grandparent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " is the grandparent and age is " + age);
    }}

    class Parents extends Grandparent {

        Parents(String name, int age) {
            super(name, age);
        }

        @Override
        void show() {
            System.out.println(name + " is the parent and age is " + age);
        }
    }

    class Children extends Parents {

        Children(String name, int age) {
            super(name, age);
        }

        @Override
        void show() {
            System.out.println(name + " is the child and age is " + age);
        }
    }

    class Multilevel {

        public static void main(String[] args) {
            Children child=new Children("abc",20);
            Grandparent grand = new Grandparent("xyz", 70);
            Parents parent = new Parents("mno", 40);
            child.show();
            grand.show();
            parent.show();
        }

    }
