public class MathOperations {
    int a;
    int b;
    int c;

    void multiply(int a,int b){
        System.out.println(a*b);
    }
    void multiply(int a,int b,int c){
        System.out.println(a*b*c);
    }

    public static void main(String[] args) {
        MathOperations math=new MathOperations();
       math.multiply(5,8);
       math.multiply(7,9,3);
    }
}
