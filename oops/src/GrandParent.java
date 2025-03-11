// Base class
public class GrandParent {
    void show() {
        System.out.println("I'm the first generation of this family.");
    }
}
class Parents extends GrandParent {
    @Override
    void show() {
        System.out.println("I'm the second generation of this family.");
    }
}

// Derived class
class Childs extends Parents {
    @Override
    void show() {
        System.out.println("I'm the third/last generation of this family.");
    }
}


class Multilevel {
    public static void main(String[] args) {
        Childs child = new Childs();
        Parents parent = new Parents();
        GrandParent grandParent = new GrandParent();
        grandParent.show();
        parent.show();
        child.show();
    }
}
