import java.util.Scanner;

public class MathOperations {

    void multiply(int a,int b){
        System.out.println(a*b);
    }

    void multiply(int a,int b,int c){
        System.out.println(a*b*c);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        MathOperations math=new MathOperations();
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        math.multiply(a,b);
        math.multiply(a,b,c);
        math.add(a,b);
        math.add(a,b,c);

    }
}
