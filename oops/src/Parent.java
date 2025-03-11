public  class Parent {

    void Show() {
        System.out.println("Im parent class");
    }

}
class Child extends Parent {
        @Override
        void Show() {
            System.out.println("Im the child of parent class");
        }
    }
    class main {
        public static void main(String[] args) {
            Parent parent=new Parent();
            Child child = new Child();
            parent.Show();
            child.Show();

        }
    }
