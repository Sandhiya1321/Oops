public class shapeFactory {
    public shape createShape(String type){
        if(type.equalsIgnoreCase("circle")){
           return new circle();
        }
        else if(type.equalsIgnoreCase("triangle")){
            return new triangle();
        }
        else{
            return new square();
        }
    }
    interface shape{
        void area();
    }
    class circle implements shape{

        @Override
        public void area() {

        }
    }
    class triangle implements shape{

        @Override
        public void area() {

        }
    }
    class square implements shape{

        @Override
        public void area() {

        }
    }
    public static void main(String[] args) {
        shapeFactory shapeFactory=new shapeFactory();
        shape shape1=shapeFactory.createShape("circle");
        shape1.area();
        shape shape2=shapeFactory.createShape("circle");
        shape2.area();
        shape shape3=shapeFactory.createShape("circle");
        shape3.area();
    }
}
