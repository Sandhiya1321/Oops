public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(double weight) {
        this.weight = weight;
    }
    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }
    public BoxWeight(BoxWeight old) {

        this.weight = old.weight;
    }
    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }
    public static void main(String[] args) {
//         BoxWeight boxWeight=new BoxWeight(8.0);
//         System.out.println(boxWeight.weight);//8.0

//         Box box=new BoxWeight(9,0,2,45);
//         System.out.println(box.w);//0.0,9.0
//         BoxPrice boxprice=new BoxPrice(90,9);

//         System.out.println(boxprice.price);//9.0
//         boxprice.display();//box is boxing
        BoxPrice box=new BoxPrice(5.0,200.0,80);


    }
}